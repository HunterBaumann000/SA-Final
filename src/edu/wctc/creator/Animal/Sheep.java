package edu.wctc.creator.Animal;

import edu.wctc.creator.Animal.Animal;

public class Sheep extends Animal {

    private boolean hasBeenSheered;

    public Sheep(String name, double happinessAmount, double thirstAmount, double hungerAmount, boolean hasBeenSheered) {
        super(name, happinessAmount, thirstAmount, hungerAmount);
        this.hasBeenSheered = hasBeenSheered;
    }

    public boolean isHasBeenSheered() {
        return hasBeenSheered;
    }

    public void setHasBeenSheered(boolean hasBeenSheered) {
        this.hasBeenSheered = hasBeenSheered;
    }
}
