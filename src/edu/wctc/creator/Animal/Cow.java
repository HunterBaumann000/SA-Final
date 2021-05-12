package edu.wctc.creator.Animal;

import edu.wctc.creator.Animal.Animal;

public class Cow extends Animal {

    private boolean hasBeenMilked;

    public Cow(String name, double happinessAmount, double thirstAmount, double hungerAmount, boolean hasBeenMilked) {
        super(name, happinessAmount, thirstAmount, hungerAmount);
        this.hasBeenMilked = hasBeenMilked;
    }

    public boolean isHasBeenMilked() {
        return hasBeenMilked;
    }

    public void setHasBeenMilked(boolean hasBeenMilked) {
        this.hasBeenMilked = hasBeenMilked;
    }
}
