package decoraterPattern.coffee;

import decoraterPattern.Beverage;
import decoraterPattern.Size;

public class Espresso extends Beverage {
    public Espresso(Size size) {
        description = "에스프레소";
        setSize(size);
    }

    @Override
    public double cost() {
        if(this.size == Size.TALL){
            return 1.09;
        }else if(this.size == Size.GRANDE){
            return 1.59;
        }else{
            return 1.99;
        }
    }


}
