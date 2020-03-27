package gamefight.testik;

public class Aeroplan implements Flyable {
    @Override
    public void fly() {
        System.out.println("Аэроплан летит со скоростью света");
    }

    @Override
    public void live() {
        int i = 1;
        int j = 2;
        int c;
        System.out.println(c = i + j);
    }
}
