package edu.wctc.creator.tempOrganization;

import edu.wctc.creator.Animal.Animal;

import java.util.ArrayList;
import java.util.List;

public class Barn {

    public List<Animal> animalList = new ArrayList<>(3);

    private boolean hasCow;
    private boolean hasHorse;
    private boolean hasSheep;
    private boolean hasPig;

    public void updateAnimalBooleans(){
        if (animalList.get(0) == null) {
            setHasCow(false);
        }

        if (animalList.get(1) == null) {
            setHasSheep(false);
        }

        if (animalList.get(2) == null) {
            setHasHorse(false);
        }

        if (animalList.get(3) == null) {
            setHasPig(false);
        }
    }

    public boolean isHasCow() {
        return hasCow;
    }

    public boolean isHasHorse() {
        return hasHorse;
    }

    public boolean isHasSheep() {
        return hasSheep;
    }

    public boolean isHasPig() {
        return hasPig;
    }

    public void setHasCow(boolean hasCow) {
        this.hasCow = hasCow;
    }

    public void setHasHorse(boolean hasHorse) {
        this.hasHorse = hasHorse;
    }

    public void setHasSheep(boolean hasSheep) {
        this.hasSheep = hasSheep;
    }

    public void setHasPig(boolean hasPig) {
        this.hasPig = hasPig;
    }
}
