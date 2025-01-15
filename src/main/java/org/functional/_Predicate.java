package org.functional;

import org.acompletenoobsmoke.VideoGame;

import java.util.function.Predicate;

import static org.acompletenoobsmoke.VideoGame.Consoles.*;

public class _Predicate {
    public static void main(String[] args) {
        VideoGame Halo = new VideoGame("Halo", XBOX);
        VideoGame Mario = new VideoGame("Mario", NINTENDO);
        VideoGame LOU = new VideoGame("The Last Of Us", PLAYSTATION);
//        System.out.println(isPlaystation.test(Halo.getConsole()));
//        System.out.println(isPlaystation.test(Mario.getConsole()));
//        System.out.println(isPlaystation.test(LOU.getConsole()));

        System.out.println(videoGamePredicate.and(isXBOX).test(Halo));
        System.out.println(videoGamePredicate.and(isXBOX).test(Mario));

    }

    static Predicate<VideoGame.Consoles> isPlaystation = PLAYSTATION::equals;
    static Predicate<VideoGame> videoGamePredicate = videoGame -> videoGame.getTitle().equals("Halo");

    static Predicate<VideoGame> isXBOX = videoGame -> XBOX.equals(videoGame.getConsole());
}
