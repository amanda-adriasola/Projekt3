package se.sprinto.hakan.adventuregame.model;

import org.junit.jupiter.api.Test;
import se.sprinto.hakan.adventuregame.model.Enemy;
import se.sprinto.hakan.adventuregame.model.Player;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {

    @Test
    public void testPlayerAttackReducesEnemyHealth() {

        Player player = new Player("TestSpelare", 100, 0, 10);

        Enemy enemy = new Enemy("TestFiende", 50, 0, 5);

        int originalHealth = enemy.getHealth();

        player.attack(enemy);

        assertEquals(originalHealth- player.getStrength(), enemy.getHealth(),
                "Fiendens hälsa borde ha minskat med spelarens styrka");
    }
}
