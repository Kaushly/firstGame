package ru.game.divvvan.items;

import ru.game.divvvan.factory.Effect;

import java.util.List;

import static ru.game.divvvan.items.ItemType.ARMOR;

public class Armor implements RealItem {

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

    @Override
    public ItemType getType() {
        return ARMOR;
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
