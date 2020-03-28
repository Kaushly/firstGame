package gamefight.testik;

import java.util.ArrayList;
import java.util.List;

public class MainFi {

    public static void main(String[] args) {

        List<Flyable> flyables = new ArrayList<>();


        Fly fly = new Fly();
        Flyable aeroplan = new Aeroplan();
        Flyable table = new Table();

        flyables.add(fly);
        flyables.add(aeroplan);
        flyables.add(table);

        for (Flyable flyable : flyables) {
            flyable.fly();
        }
    }
}
