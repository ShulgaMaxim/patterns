package lab2.factory.creator;

import lab2.factory.lunch.BuisnessLunchComponent;
import lab2.factory.lunch.Lunch;
import lab2.factory.lunch.WednesdayBuisnessLunch;

public class WednesdayLunchCreator implements LunchCreator {
    @Override
    public Lunch createLunch() {
        BuisnessLunchComponent appetizer = new BuisnessLunchComponent("Салат греческий", 100);
        BuisnessLunchComponent soup = new BuisnessLunchComponent("Бульон куриный с яйцом", 200);
        BuisnessLunchComponent entree = new BuisnessLunchComponent("Лазанья болоньезе", 250);
        return new WednesdayBuisnessLunch(250, appetizer, soup, entree);
    }
}
