package GameLogic;

public class Spell {
    private String name;
    private int energyCost;
    private double successRate;
    private int damage;

    public Spell(String name, int energyCost, int successRate, int damage) {
        this.name = name;
        this.energyCost = energyCost;
        this.successRate = successRate;
        this.damage = damage;
    }

    // getters et setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public double getSuccessRate() {
        return successRate;
    }

    public void setSuccessRate(double successRate) {
        this.successRate = successRate;
    }
}
