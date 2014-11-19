package lab2.factory.creator;

import lab2.factory.lunch.BuisnessLunchComponent;
import lab2.factory.lunch.Lunch;
import lab2.factory.lunch.MondayBuisnessLunch;

public class MondayLunchCreator implements LunchCreator {
    @Override
    public Lunch createLunch() {
        BuisnessLunchComponent appetizer = new BuisnessLunchComponent("Сельдь под шубой", 100);
        BuisnessLunchComponent soup = new BuisnessLunchComponent("Суп-пюре гороховый", 200);
        BuisnessLunchComponent entree = new BuisnessLunchComponent("Жаркое из птицы в горшочке", 250);
        return new MondayBuisnessLunch(250, appetizer, soup, entree);
    }
}
