package lab1.model;


public class Car {
    protected String mark;
    protected String model;
    protected Engine engine;

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }

    public Car(String mark, String model, Engine engine) {
        this.mark = mark;
        this.model = model;
        this.engine = engine;
    }
}
