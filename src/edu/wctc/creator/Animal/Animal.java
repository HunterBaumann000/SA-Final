package edu.wctc.creator.Animal;

public class Animal {
    private double happinessAmount;
    private double thirstAmount;
    private double hungerAmount;
    private String name;

    public Animal(String name, double happinessAmount, double thirstAmount, double hungerAmount) {
        this.name = name;
        this.happinessAmount = happinessAmount;
        this.thirstAmount = thirstAmount;
        this.hungerAmount = hungerAmount;
    }

    public double getHappinessAmount() {
        return happinessAmount;
    }

    public double getHungerAmount() {
        return hungerAmount;
    }

    public double getThirstAmount() {
        return thirstAmount;
    }

    public String getName() {
        return name;
    }

    public void setHappinessAmount(double happiness) {
        this.happinessAmount = happiness;
    }

    public void setHungerAmount(double hungerAmount) {
        this.hungerAmount = hungerAmount;
    }

    public void setThirstAmount(double thirstAmount) {
        this.thirstAmount = thirstAmount;
    }

    public void setName(String name) {
        this.name = name;
    }
}
