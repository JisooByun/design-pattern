package decoraterPattern;

import decoraterPattern.coffee.Espresso;
import decoraterPattern.option.Mocha;
import decoraterPattern.option.Whip;

public class Main {
    public static void main(String[] args) {
        Beverage coffee1 = new Espresso(Size.GRANDE);
        coffee1 = new Mocha(coffee1);
        coffee1 = new Mocha(coffee1);
        coffee1 = new Whip(coffee1);
        coffee1 = new Whip(coffee1);
        coffee1 = new Whip(coffee1);
        System.out.println(coffee1.getDescription()+" $" +coffee1.cost());
    }
}
