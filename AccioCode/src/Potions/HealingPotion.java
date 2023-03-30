package Potions;

import GameLogic.Potion;

public class HealingPotion extends Potion {
    public HealingPotion(int healthPoints, int energyPoints) {
        super("HealingPotion", healthPoints, energyPoints);
    }
}
