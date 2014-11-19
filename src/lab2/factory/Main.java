package lab2.factory;

import lab2.factory.creator.LunchCreator;
import lab2.factory.creator.MondayLunchCreator;
import lab2.factory.creator.TuesdayLunchCreator;
import lab2.factory.creator.WednesdayLunchCreator;

public class Main {
    static LunchCreator[] creators = {new MondayLunchCreator(), new TuesdayLunchCreator(),
            new WednesdayLunchCreator()};

    public static void main(String[] args) {
        for (int i = 0; i < creators.length; i++) {
            LunchCreator creator = creators[i];
            creator.createLunch().printComponents();
        }
    }
}
