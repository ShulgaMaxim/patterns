package lab2.factory.creator;

import lab2.factory.lunch.BuisnessLunchComponent;
import lab2.factory.lunch.Lunch;
import lab2.factory.lunch.TuesdayBuisnessLunch;

public class TuesdayLunchCreator implements LunchCreator {
    @Override
    public Lunch createLunch() {
        BuisnessLunchComponent appetizer = new BuisnessLunchComponent("Салат легкий с огурцами", 100);
        BuisnessLunchComponent soup = new BuisnessLunchComponent("Рассольник рыбный со сметаной", 200);
        BuisnessLunchComponent entree = new BuisnessLunchComponent("Отбивная из свинины с картофелем", 250);
        return new TuesdayBuisnessLunch(250, appetizer, soup, entree);
    }
}
