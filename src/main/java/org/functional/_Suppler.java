package org.functional;

import org.acompletenoobsmoke.VideoGame;

import java.util.function.Supplier;

import static org.acompletenoobsmoke.VideoGame.Consoles.PLAYSTATION;

public class _Suppler {

    public static void main(String[] args) {
        System.out.println("The Greatest Game Ever");
        System.out.println(getGreatestGameEver.get());
    }

    static Supplier<VideoGame> getGreatestGameEver = () -> new VideoGame("San Andreas", PLAYSTATION);

}
