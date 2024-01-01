package CarFactory;

import Car.Car;

public interface AbstractFactory {
    public Car getInstance(int price);
}
