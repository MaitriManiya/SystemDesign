package Car;


import CarFactory.AbstractFactory;

public class LuxuryCarFactory implements AbstractFactory {
    @Override
    public Car getInstance(int price) {
        if(price<=300)
        {
            return new LuxuryCar1();
        }
        if(price<=400){
            return  new LuxuryCar2();
        }
        return  null;
    }
}
