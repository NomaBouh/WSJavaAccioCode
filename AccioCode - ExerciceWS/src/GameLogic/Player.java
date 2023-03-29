package GameLogic;

import java.util.Random;

public class Player {
    private String name;
    private int health;
    private int maxHealth;
    private int energy;
    private int maxEnergy;
    private int strength;
    private int defense;
    private int accuracy;
    private int evasion;
    private Random random = new Random();

    public Player(String name, int health, int maxHealth, int energy, int maxEnergy, int strength, int defense, int accuracy, int evasion) {
        this.health = 100;
        this.maxHealth = 100;
        this.energy = 100;
        this.maxEnergy = 100;
    }

    public void castSpell(Enemy enemy, Player player) {
        double successRate = player.getAccuracy();
        double random = Math.random();
        if (random <= successRate) {
            int damage = player.getStrength();
            enemy.takeDamage(damage);
            System.out.println("Vous infligez " + damage + " points de dégâts !");
        } else {
            System.out.println("Vous ratez votre cible !");
        }
    }


    // Getters
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getEnergy() {
        return energy;
    }

    public int getMaxEnergy() {
        return maxEnergy;
    }

    public int getStrength() {
        return strength;
    }

    public int getDefense() {
        return defense;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public int getEvasion() {
        return evasion;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void setMaxEnergy(int maxEnergy) {
        this.maxEnergy = maxEnergy;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public void setEvasion(int evasion) {
        this.evasion = evasion;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void takeDamage(int damage) {
        int actualDamage = Math.max(damage - defense, 0);
        health -= actualDamage;
    }
}

