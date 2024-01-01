import Car.Car;
import CarFactory.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactoryProducer abstractFactoryProducer= new AbstractFactoryProducer();
        AbstractFactory abstractFactory= abstractFactoryProducer.getFactoryInstance("Luxury");

         Car carObj=abstractFactory.getInstance(300);
        System.out.println(carObj.getTopSpeed());
    }
}