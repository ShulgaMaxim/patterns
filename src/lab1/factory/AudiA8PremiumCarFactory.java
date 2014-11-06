package lab1.factory;

import lab1.model.Car;
import lab1.model.Engine;

public class AudiA8PremiumCarFactory extends AudiA8BaseCarFactory {

    @Override
    public Car createCar() {
        Engine engine = new Engine(435, carMark, model, 4.0);
        return new Car(carMark,model, engine);
    }
}
