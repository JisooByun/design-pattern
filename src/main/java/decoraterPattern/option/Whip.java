package decoraterPattern.option;


import decoraterPattern.Beverage;

public class Whip extends CondimentDecorator {

    public Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return this.beverage.cost() + .70;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ",휩";
    }
}
