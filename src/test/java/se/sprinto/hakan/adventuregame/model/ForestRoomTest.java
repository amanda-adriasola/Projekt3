package se.sprinto.hakan.adventuregame.model;

import org.junit.jupiter.api.Test;
import se.sprinto.hakan.adventuregame.view.FakeUI;

import static org.junit.jupiter.api.Assertions.assertTrue;
public class ForestRoomTest {

    @Test
    public void testPlayerFindsKeyWhenAnsweringYes() {
        // skapa en instans av FakeUI
        FakeUI fakeUI = new FakeUI();

        // Sätt input på "ja"
        fakeUI.setInput("ja");

        // skapa en instans av Player
        Player player = new Player.Builder().name("TestSpelare").health(100).score(0).strength(10).build();
        // skapa en instans av ForestRoom
        ForestRoom forestRoom = new ForestRoom();

        // Anropa metoden enterRoom med spelare och FakeUI som argument.
        forestRoom.enterRoom(player, fakeUI);

        //Verifiera att spelare har hittat nyckeln.
        assertTrue(player.hasFoundKey(), "Spelare borde ha hittat nyckeln när den svarar 'ja'." );
    }

}
