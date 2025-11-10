package se.sprinto.hakan.adventuregame.model;

import org.junit.jupiter.api.Test;
import se.sprinto.hakan.adventuregame.view.FakeUI;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TreasureRoomTest {

    @Test
    public void testPlayerCanOpenChestWithKey() {

        //skapa en instans av FakeUI och sätt input till "ja".
        FakeUI fakeUI = new FakeUI();
        fakeUI.setInput("ja");

        //skapa en instans av Player.
        Player player = new Player.Builder().name("TestSpelare").health(100).score(0).strength(10).build();

        //Sätt att spelare har hittat nyckeln.
        player.setFoundKey(true);

        //skapa en instans av TreasureRoom.
        TreasureRoom treasureRoom = new TreasureRoom();

        // Anropa metoden enterRoom med spelare och FakeUI som argument.
        treasureRoom.enterRoom(player, fakeUI);

        //Verifiera att spelaren har öppnat kistan.
        assertTrue(player.hasOpenedChest(), "Spelare borde ha kunna öppna kistan när du har nyckeln.");
    }
}
