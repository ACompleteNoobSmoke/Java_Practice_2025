package org.acompletenoobsmoke;

import java.util.function.Consumer;

public class VideoGame {

    private final String title;
    private final Consoles console;

    public VideoGame(String title, Consoles console) {
        this.title = title;
        this.console = console;
    }



    @Override
    public String toString() {
        return "Game Title: " + title + "\n" +
                "Game Console: " + console.toString() + "\n";
    }


    public enum Consoles {
        PLAYSTATION,
        XBOX,
        NINTENDO,
        PC
    }
}
