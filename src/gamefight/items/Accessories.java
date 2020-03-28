package gamefight.items;

import gamefight.factory.Effect;

import java.util.List;

public class Accessories {
//fn+shift+f6
    private String name;
//    private double weight;
//    private int bonusHP;
    private List<Effect> effect;

//    private int bonusStrong;
//    private int bonusArmorr;



    public Accessories(String name, List<Effect> effect){
        this.name = name;
//        this.weight = weight;
        this.effect = effect;
//        this.bonusHP = bonusHP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

//    public double getWeight() {
//        return weight;
//    }

//    public void setWeight(double weight) {
//        this.weight = weight;
//    }

    @Override
    public String toString() {
        return "fight.items.Accessories{" +
                "dropName='" + name + '\'' +
                ", effect=" + effect +
                '}';
    }
}
