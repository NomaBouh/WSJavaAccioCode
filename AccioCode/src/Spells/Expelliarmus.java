package Spells;

import GameLogic.Spell;

public class Expelliarmus extends Spell {
    public Expelliarmus(int energyCost, int successRate, int damage) {
        super("Expelliarmus", energyCost, successRate, damage);
    }
}
