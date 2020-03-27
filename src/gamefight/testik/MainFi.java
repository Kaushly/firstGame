package gamefight.testik;

import java.util.ArrayList;
import java.util.List;

public class MainFi {

    public static void main(String[] args) {

        List<Flyable> flyables = new ArrayList<>();


        flyables.add(new Fly());
        flyables.add(new Aeroplan());
        flyables.add(new Table());


        for (Flyable flyable : flyables) {
            flyable.fly();
            flyable.live();
        }
    }
}
