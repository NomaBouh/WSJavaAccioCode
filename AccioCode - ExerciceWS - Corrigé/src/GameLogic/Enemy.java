package GameLogic;

public class Enemy {
    private String name;
    private int healthPoints;
    private int damage;
    private int defense;
    private int resistance;

    public Enemy(String name, int healthPoints, int damage, int defense, int resistance) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.damage = damage;
        this.defense = defense;
        this.resistance = resistance;
    }

    public void takeDamage(int damage) {
        // logique pour prendre des dégâts
    }

    public boolean attack(Player player) {
        // logique pour attaquer le joueur
        return false;
    }

    public String getName() {
        return name;
    }

    public boolean isAlive() {
        return true; //TODO
    }

    public String getHealth() {
        return "TODO"; //TODO
    }

    public int getDamage() {
        return damage;
    }

    // getters et setters
}

