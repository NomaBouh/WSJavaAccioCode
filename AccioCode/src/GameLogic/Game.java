package GameLogic;

import Potions.*;
import Spells.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private int level;
    private Player player;
    private ArrayList<Enemy> enemies;
    private ArrayList<Spell> spells;
    private ArrayList<Potion> potions;

    public Game(/*int level*/) {
        //this.level = level;
        try {
            this.player = new Player("Debilus", "none", this.player.getWand(), player.getSpells(), player.getPotions(), 100, 100, 100, 100, 20, 20, 20, 20, 0); //TODO définir caractéristique du player
            this.enemies = new ArrayList<>();
        } catch (Exception e){}
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenue dans le jeu Harry Potter At Home !");
        System.out.println("Choisissez votre maison : Gryffondor, Poufsouffle, Serdaigle, ou Serpentard.");
        String house = scanner.nextLine();

        SortingHat sortingHat = new SortingHat();
        sortingHat.assignHouse(house, player);

        System.out.println("Bienvenue dans votre maison, " + player.getName() + " !");
        System.out.println("Votre première épreuve sera un duel contre un ennemi !");

        Enemy enemy = new Enemy("Ennemi 1", 20, 2,2,2);
        System.out.println("Un ennemi se présente à vous : " + enemy.getName());

        while (player.isAlive() && enemy.isAlive()) {
            System.out.println(player.getName() + " a " + player.getHealth() + " points de vie.");
            System.out.println(enemy.getName() + " a " + enemy.getHealth() + " points de vie.");
            System.out.println("Que voulez-vous faire ?");
            System.out.println("1 - Lancer un sort");
            System.out.println("2 - Utiliser une potion");
            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                System.out.println("Quel sort voulez-vous lancer ?");
                System.out.println("1 - Expelliarmus");
                System.out.println("2 - Stupefix");
                String spellChoice = scanner.nextLine();

                Spell spell;
                if (spellChoice.equals("1")) {
                    spell = new Expelliarmus(5,90,10);
                } else {
                    spell = new Stupefix(3,95,1);
                }

                player.castSpell(spell, enemy);

            } else {
                System.out.println("Quelle potion voulez-vous utiliser ?");
                System.out.println("1 - Potion de soin (restaure 20 points de vie)");
                System.out.println("2 - Potion de force (augmente les dégâts des sorts de 50%)");
                String potionChoice = scanner.nextLine();

                Potion potion;
                if (potionChoice.equals("1")) {
                    potion = new HealingPotion(50+ player.getBonusPotion(),0);
                } else {
                    potion = new StrengthPotion(10+ player.getBonusPotion()/2,0);
                }

                player.usePotion(potion);
                System.out.println(player.getName() + " utilise " + potion.getName() + ".");
            }

            boolean enemySuccess = enemy.attack(player);
            if (enemySuccess) {
                int damage = enemy.getDamage();
                player.takeDamage(damage);
                System.out.println(enemy.getName() + " attaque et inflige " + damage + " points de dégâts !");
            } else {
                System.out.println(enemy.getName() + " attaque mais rate sa cible !");
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

