package se.sprinto.hakan.adventuregame.model;

import org.junit.jupiter.api.Test;
import se.sprinto.hakan.adventuregame.model.Enemy;
import se.sprinto.hakan.adventuregame.model.Player;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {

    @Test
    public void testPlayerAttackReducesEnemyHealth() {

        // Skapa en Player-objekt.
        Player player = new Player.Builder().name("TestSpelare").health(100).score(0).strength(10).build();

        // Skapa en Enemy-objekt.
        Enemy enemy = new Enemy("TestFiende", 50, 0, 5);

        // Spara fiendens ursprungliga hälsa.
        int originalHealth = enemy.getHealth();

        // Anropa player.attack(enemy).
        player.attack(enemy);

        // Verifiera att Enemy-objektets hälsa har minskat med spelarens styrka (strength).
        assertEquals(originalHealth- player.getStrength(), enemy.getHealth(),
                "Fiendens hälsa borde ha minskat med spelarens styrka");
    }
}
