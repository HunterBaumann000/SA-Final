package edu.wctc.creator.Animal;

import edu.wctc.creator.Animal.Animal;

public class Pig extends Animal {

    private boolean hasBeenCleaned;

    public Pig(String name, double happinessAmount, double thirstAmount, double hungerAmount, boolean hasBeenCleaned) {
        super(name, happinessAmount, thirstAmount, hungerAmount);
        this.hasBeenCleaned = hasBeenCleaned;
    }

    public boolean isHasBeenCleaned() {
        return hasBeenCleaned;
    }

    public void setHasBeenCleaned(boolean hasBeenCleaned) {
        this.hasBeenCleaned = hasBeenCleaned;
    }
}
