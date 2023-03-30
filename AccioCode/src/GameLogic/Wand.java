package GameLogic;

public class Wand {
    private Core coreType;
    private int length;
    private Spell spell;

    public Wand(Core coreMaterial, int length) {
        this.coreType = coreMaterial;
        this.length = length;
    }

    // getters et setters
    public double getSuccessRate(Spell spell) {
        return 0;
    }

    public Core getCoreType() {
        return coreType;
    }

    public void setCoreType(Core coreType) {
        this.coreType = coreType;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}

