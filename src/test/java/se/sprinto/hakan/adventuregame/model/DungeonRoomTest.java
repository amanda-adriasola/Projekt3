package se.sprinto.hakan.adventuregame.model;

import org.junit.jupiter.api.Test;
import se.sprinto.hakan.adventuregame.view.FakeUI;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class DungeonRoomTest {

    @Test
    public void testPlayerDefeatsEnemyByAttacking() {

        // skapa en instans av FakeUI och sätt input till "a".
        FakeUI fakeUI = new FakeUI();
        fakeUI.setInput("a");

        // skapa en instans av Player.
        Player player = new Player.Builder().name("TestSpelare").health(100).score(0).strength(10).build();

        //skapa en instans av DungeonRoom.
        DungeonRoom dungeonRoom = new DungeonRoom();

        //Anropa metoden enterRoom med spelare och FakeUI som argument.
        dungeonRoom.enterRoom(player, fakeUI);

        //Verifiera att spelare har besegrat fienden.
        assertTrue(player.hasDefeatedEnemy(), "Spelare borde ha besegrat fienden genom att attackare");
    }
}
