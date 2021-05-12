package edu.wctc.creator.AnimalConsumptionStrategy;

public class MediumConsumption implements ConsumptionBehavior{
    @Override
    public double consumption(int num) {
        return num * 1.5;
    }
}
