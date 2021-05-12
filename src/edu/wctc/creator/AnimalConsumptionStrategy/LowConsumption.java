package edu.wctc.creator.AnimalConsumptionStrategy;

public class LowConsumption implements ConsumptionBehavior{
    @Override
    public double consumption(int num) {
        return num * .5;
    }
}
