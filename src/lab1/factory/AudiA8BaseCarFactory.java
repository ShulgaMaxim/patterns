package lab1.factory;

import lab1.model.Car;
import lab1.model.Engine;

public class AudiA8BaseCarFactory extends AbstractAudiCarFactory {
    protected final String model = "A8";

    @Override
    public Car createCar() {
        Engine engine = new Engine(250, carMark, model, 3.0);
        return new Car(carMark, model, engine);
    }
}
