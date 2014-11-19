package lab2.factory.lunch;

public abstract class BuisnessLunch implements Lunch {

    protected BuisnessLunch(long price, BuisnessLunchComponent appetizer, BuisnessLunchComponent entree, BuisnessLunchComponent soup) {
        this.price = price;
        this.appetizer = appetizer;
        this.entree = entree;
        this.soup = soup;
    }

    protected long price;
    protected BuisnessLunchComponent appetizer;
    protected BuisnessLunchComponent entree;
    protected BuisnessLunchComponent soup;

    @Override
    public long getPrice() {
        return price;
    }

    @Override
    public void printComponents() {
        System.out.println("Appetizer " + appetizer);
        System.out.println("Soup " + soup);
        System.out.println("Entree " + entree);
        System.out.println("Price " + price);
    }
}
