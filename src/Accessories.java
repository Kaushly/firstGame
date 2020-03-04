import java.util.List;

public class Accessories {
//fn+shift+f6
    private String dropName;
    private double weight;
//    private int bonusHP;
    private List<Effect> effect;

//    private int bonusStrong;
//    private int bonusArmorr;



    public Accessories(String dropName, double weight, List<Effect> effect){
        this.dropName = dropName;
        this.weight = weight;
        this.effect = effect;
//        this.bonusHP = bonusHP;
    }

    public String getDropName() {
        return dropName;
    }

    public void setDropName(String dropName) {
        this.dropName = dropName;
    }

    public List<Effect> getEffect() {
        return effect;
    }

    public void setEffect(List<Effect> effect) {
        this.effect = effect;
    }

//    public int getBonusHP() {
//        return bonusHP;
//    }

//    public void setBonusHP(int bonusHP) {
//        this.bonusHP = bonusHP;
//    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
