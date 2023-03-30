package GameLogic;

public class Potion {
    private String name;
    private int healthPoints;
    private int energyPoints;

    public Potion(String name, int healthPoints, int energyPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.energyPoints = energyPoints;
    }

    // getters et setters
    public String getName() {
        return name;
    }

    public int getAmount() {
        return 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }


}

