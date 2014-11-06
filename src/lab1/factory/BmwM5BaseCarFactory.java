package lab1.factory;

import lab1.model.Car;
import lab1.model.Engine;

public class BmwM5BaseCarFactory extends BMWCarFactory {
    protected final String model = "M5";
    @Override
    public Car createCar() {
        Engine m5Engine = new Engine(412, carMark, model, 4.4);
        return new Car(carMark, model, m5Engine);
    }
}
