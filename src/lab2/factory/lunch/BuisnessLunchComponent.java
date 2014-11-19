package lab2.factory.lunch;

public class BuisnessLunchComponent {
    private final String name;

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }

    private final int volume;

    public BuisnessLunchComponent(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}
