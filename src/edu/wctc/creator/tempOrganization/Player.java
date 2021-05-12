package edu.wctc.creator.tempOrganization;

import java.util.List;

public class Player extends Barn{
    //Singleton Pattern
    private static Player INSTANCE;
    private double money;
    private double animalFoodAmount;
    private List<String> playerCollectables;

    public Player(double money, double animalFoodAmount/*, List<String> playerCollectables */) {
        this.money = money;
        this.animalFoodAmount = animalFoodAmount;
       //this.playerCollectables = playerCollectables;
    }

    public static Player getInstance() {
        if(INSTANCE == null) {
            assert false;
            INSTANCE = new Player(INSTANCE.money, INSTANCE.animalFoodAmount/*, INSTANCE.playerCollectables*/);
        }
        return INSTANCE;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setAnimalFoodAmount(double animalFoodAmount) {
        this.animalFoodAmount = animalFoodAmount;
    }

    public void setPlayerCollectables(List<String> playerCollectables) {
        this.playerCollectables = playerCollectables;
    }

    public double getMoney() {
        return money;
    }

    public double getAnimalFoodAmount() {
        return animalFoodAmount;
    }

    public List<String> getPlayerCollectables() {
        return playerCollectables;
    }
}
