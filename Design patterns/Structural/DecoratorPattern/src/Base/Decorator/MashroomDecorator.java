package Base.Decorator;

import Base.BasePizza;

public class MashroomDecorator extends ToppingDecorator{

    BasePizza basePizza;
    public MashroomDecorator(BasePizza basePizza){
        this.basePizza=basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost()+30;
    }
}
