package org.streams;

import org.acompletenoobsmoke.VideoGame;

import java.util.List;

import static org.acompletenoobsmoke.VideoGame.Consoles.*;

public class _Streams {

    public static void main(String[] args) {
        List<VideoGame> gameList = List.of(
                new VideoGame("Resident Evil 4", NINTENDO),
                new VideoGame("Metal Gear Solid", PLAYSTATION),
                new VideoGame("Ninja Gaiden", XBOX),
                new VideoGame("The Sims", PC),
                new VideoGame("Gears of War 3", XBOX)
        );
        gameList.stream()
                .filter(game -> XBOX.equals(game.getConsole()))
                .map(VideoGame::getTitle)
                .forEach(System.out::println);
    }
}
