package GameLogic;

import java.util.Random;

public class Player {
    private String name;
    private int bonusPotion;
    private int health;
    private int maxHealth;
    private int energy;
    private int maxEnergy;
    private int strength;
    private int defense;
    private int accuracy;
    private int evasion;
    private Wand wand;
    private Spell[] spells;
    private Potion[] potions;
    private House house;
    private Random random = new Random();

    public Player(String name,String house, Wand wand, Spell[] spells, Potion[] potions, int health, int maxHealth, int energy, int maxEnergy, int strength, int defense, int accuracy, int evasion, int bonusPotion) {
        this.health = 100;
        this.maxHealth = 100;
        this.energy = 100;
        this.maxEnergy = 100;
        this.wand = new Wand(Core.NONE, random.nextInt(15,40)); //TODO: définir un Core et un wood
        this.house = House.NONE;
        this.bonusPotion = 0;
    }

    public void castSpell(Spell spell, Enemy enemy) {
        double successRate = wand.getSuccessRate(spell);
        double random = Math.random();
        if (random <= successRate) {
            int damage = spell.getDamage();
            enemy.takeDamage(damage);
            System.out.println("Vous lancez " + spell.getName() + " et infligez " + damage + " points de dégâts !");
        } else {
            System.out.println("Vous lancez " + spell.getName() + " mais ratez votre cible !");
        }
    }

    public void usePotion(Potion potion) {
        int amount = potion.getAmount();
        if (health + amount > 100) {
            health = 100;
        } else {
            health += amount;
        }
        System.out.println("You used a " + potion.getName() + " and gained " + amount + " health points!");
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

    public Wand getWand() {
        return wand;
    }

    public Spell[] getSpells() {
        return spells;
    }

    public Potion[] getPotions() {
        return potions;
    }

    public House getHouse() {
        return house;
    }

    public int getBonusPotion(){return bonusPotion;}

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

    public void setWand(Wand wand) {
        this.wand = wand;
    }

    public void setSpells(Spell[] spells) {
        this.spells = spells;
    }

    public void setPotions(Potion[] potions) {
        this.potions = potions;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public void setBonusPotion(int bonusPotion){this.bonusPotion = bonusPotion;}

    public boolean isAlive() {
        return health > 0;
    }

    public void takeDamage(int damage) {
        int actualDamage = Math.max(damage - defense, 0);
        health -= actualDamage;
    }
}

