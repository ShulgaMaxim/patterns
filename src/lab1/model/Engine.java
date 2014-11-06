package lab1.model;

public class Engine {
    private int horsePower;
    private String carMark;
    private String carModel;
    private double capacity;

public Engine(int horesePower, String carMark, String carModel, double capacity) {
        this.horsePower = horesePower;
        this.carMark = carMark;
        this.carModel = carModel;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "horsePower=" + horsePower +
                ", carMark='" + carMark + '\'' +
                ", carModel='" + carModel + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
