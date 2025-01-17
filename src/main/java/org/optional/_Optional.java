package org.optional;

import org.acompletenoobsmoke.VideoGame;

import java.util.List;
import java.util.Optional;

import static org.acompletenoobsmoke.VideoGame.Consoles.*;

public class _Optional {
    public static void main(String[] args) {
        List<VideoGame> gameList = List.of(
                new VideoGame("Resident Evil 4", NINTENDO),
                new VideoGame("Metal Gear Solid", PLAYSTATION),
                new VideoGame("Ninja Gaiden", XBOX),
                new VideoGame("The Sims", PC),
                new VideoGame("Gears of War 3", XBOX)
        );

        new _Optional().printList(null);
    }

    public void printList(List<VideoGame> videoGameList) {
        Optional.ofNullable(videoGameList).ifPresentOrElse(videoGames -> videoGames.forEach(System.out::println),
                () -> System.out.println("Empty List"));
    }
}
