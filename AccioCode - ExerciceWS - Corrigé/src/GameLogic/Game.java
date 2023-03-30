package GameLogic;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private int level;
    private Player player;
    private ArrayList<Enemy> enemies;

    public Game(/*int level*/) {
        //this.level = level;
        try {
            this.player = new Player("Debilus", 100, 100, 100, 100, 100, 20, 20, 20); //TODO définir caractéristique du player
            this.enemies = new ArrayList<>();
        } catch (Exception e){}
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenue dans le jeu Harry Potter At Home !");
        System.out.println("Choisissez votre maison : Gryffondor, Poufsouffle, Serdaigle, ou Serpentard.");
        String house = scanner.nextLine();

        System.out.println("Bienvenue dans votre maison, " + player.getName() + " !");
        System.out.println("Votre première épreuve sera un duel contre un ennemi !");

        Enemy enemy = new Enemy("Ennemi 1", 20, 2, 2, 2);
        System.out.println("Un ennemi se présente à vous : " + enemy.getName());

        while (player.isAlive() && enemy.isAlive()) {
            System.out.println(player.getName() + " a " + player.getHealth() + " points de vie.");
            System.out.println(enemy.getName() + " a " + enemy.getHealth() + " points de vie.");
            System.out.println("Que voulez-vous faire ?");
            System.out.println("1 - Lancer un sort");
            System.out.println("2 - Ne rien faire");
            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                player.castSpell(enemy, player);

                boolean enemySuccess = enemy.attack(player);
                if (enemySuccess) {
                    int damage = enemy.getDamage();
                    player.takeDamage(damage);
                    System.out.println(enemy.getName() + " attaque et inflige " + damage + " points de dégâts !");
                } else {
                    System.out.println(enemy.getName() + " attaque mais rate sa cible !");
                }
            }
        }

            if (player.isAlive()) {
                System.out.println("Félicitations, vous avez gagné le duel !");
            } else {
                System.out.println("Dommage, vous avez perdu le duel !");
            }
        }

        // getters et setters
    }

