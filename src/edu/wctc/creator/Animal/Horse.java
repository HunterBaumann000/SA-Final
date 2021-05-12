package edu.wctc.creator.Animal;

import edu.wctc.creator.Animal.Animal;

public class Horse extends Animal {

    private boolean hasBeenWalked;

    public Horse(String name, double happinessAmount, double thirstAmount, double hungerAmount, boolean hasBeenWalked) {
        super(name, happinessAmount, thirstAmount, hungerAmount);
        this.hasBeenWalked = hasBeenWalked;
    }

    public boolean isHasBeenWalked() {
        return hasBeenWalked;
    }

    public void setHasBeenWalked(boolean hasBeenWalked) {
        this.hasBeenWalked = hasBeenWalked;
    }
}
