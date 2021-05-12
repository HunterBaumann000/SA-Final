package edu.wctc.creator.AnimalConsumptionStrategy;

public class HighConsumption implements ConsumptionBehavior {
    @Override
    public double consumption(int num) {
        return num * 2.5;
    }
}
