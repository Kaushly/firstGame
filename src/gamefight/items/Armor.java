package gamefight.items;

import gamefight.factory.Effect;

import java.util.List;

public class Armor {

    private String name;
    private int weight;
    private List<Effect> effect;

    public Armor(String name, int weight, List<Effect> effect) {
        this.name = name;
        this.weight = weight;
        this.effect = effect;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public List<Effect> getEffect() {
        return effect;
    }

    public void setEffect(List<Effect> effect) {
        this.effect = effect;
    }

    @Override
    public String toString() {
        return "fight.items.Armor{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", effect=" + effect +
                '}';
    }
}
