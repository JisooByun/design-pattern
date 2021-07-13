package decoraterPattern.option;

import decoraterPattern.Beverage;

public abstract class CondimentDecorator extends Beverage {
//    Beverage의 getDescription을 추상 클래스로 만들어서 상속받는 모든 데코레이터에 description 강제
    public abstract String getDescription();
}
