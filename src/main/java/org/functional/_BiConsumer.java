package org.functional;

import org.acompletenoobsmoke.VideoGame;
import static org.acompletenoobsmoke.VideoGame.Consoles.*;

import java.util.function.BiConsumer;


public class _BiConsumer {
    public static void main(String[] args) {

        VideoGame RE4 = new VideoGame("Resident Evil 4", NINTENDO);
        VideoGame GOW2 = new VideoGame("God of War 2", PLAYSTATION);
        VideoGame RDR2 = new VideoGame("Red Dead Redemption 2", PLAYSTATION);
        _BiConsumer biConsumer = new _BiConsumer();
        biConsumer.shouldBuyConsumer.accept(RE4, true);
        biConsumer.shouldBuyConsumer.accept(GOW2, true);
        biConsumer.shouldBuyConsumer.accept(RDR2, false);
    }

   BiConsumer<VideoGame, Boolean> shouldBuyConsumer = (videoGame, ifBuy) -> {
        String willBuy = (ifBuy) ? "I will get this game" : "I will not get this game";
       System.out.println(videoGame);
       System.out.println(willBuy + "\n");
   };
}
