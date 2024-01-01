package CarFactory;


import Car.*;

public class EconomicCarFactory implements AbstractFactory{
    @Override
    public Car getInstance(int price) {
        if(price<=100)
        {
            return new EconomiCar1();
        }
        if(price<=200){
            return  new EconomiCar2();
        }
        return  null;
    }
}
