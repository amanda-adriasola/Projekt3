package se.sprinto.hakan.adventuregame.model;

import org.junit.jupiter.api.Test;
import se.sprinto.hakan.adventuregame.view.FakeUI;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TreasureRoomTest {

    @Test
    public void testPlayerCanOpenChestWithKey() {

        FakeUI fakeUI = new FakeUI();
        fakeUI.setInput("ja");

        Player player = new Player("TestSpelare", 100,0, 10 );

        player.setFoundKey(true);

        TreasureRoom treasureRoom = new TreasureRoom();

        treasureRoom.enterRoom(player, fakeUI);

        assertTrue(player.hasOpenedChest(), "Spelare borde ha kunna öppna kistan när du har nyckeln.");
    }
}
