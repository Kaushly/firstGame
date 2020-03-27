package gamefight.testik;

public class Table implements Flyable {
    @Override
    public void fly() {
        System.out.println("Стол полетел вниз");
    }

    @Override
    public void live() {
        System.out.println("Это мертвое дерево");
    }
}
