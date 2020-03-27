package gamefight.testik;

public class Fly implements Flyable {
    @Override
    public void fly() {
        System.out.println("Муха полетела быстро");
    }

    @Override
    public void live() {
        int i = 1;
        int j = 3;
        if(i < j){
            System.out.println("Жива");
            i++;
        }else
            System.out.println("-----");
    }
}
