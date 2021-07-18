package decoraterPattern.option;

import decoraterPattern.Beverage;

public class Mocha extends CondimentDecorator{

    public Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return this.beverage.cost()+.50;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription()+",모카";
    }
}
