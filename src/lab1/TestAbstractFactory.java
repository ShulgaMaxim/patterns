package lab1;

import lab1.factory.AbstractCarFactory;
import lab1.factory.AudiA8BaseCarFactory;
import lab1.factory.AudiA8PremiumCarFactory;
import lab1.factory.BmwM5BaseCarFactory;
import lab1.model.Car;

public class TestAbstractFactory {
    static AbstractCarFactory[] factories = {new BmwM5BaseCarFactory(), new AudiA8BaseCarFactory(),
            new AudiA8PremiumCarFactory()};

    public static void main(String[] args) {
        for (int i = 0; i < factories.length; i++) {
            AbstractCarFactory factory = factories[i];
            Car car = factory.createCar();
            System.out.println(car);
        }
    }
}
