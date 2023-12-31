import Base.BasePizza;
import Base.Decorator.ExtraCheeseDecorator;
import Base.VehDelightPizza;

public class Main {
    public static void main(String[] args) {
        BasePizza basePizza=new ExtraCheeseDecorator(new VehDelightPizza()) ;
        int cost=basePizza.cost();
        System.out.println(cost);
    }
}