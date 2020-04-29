package ru.game.divvvan.items;

import lombok.Data;
import ru.game.divvvan.factory.Effect;

import java.util.List;
@Data
public class Accessories implements RealItem {
    private String name;
    private List<Effect> effect;
    private long price;

    public Accessories(String name, List<Effect> effect, long price) {
        this.name = name;
        this.effect = effect;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getWeight() {
        return 0;
    }

    @Override
    public ItemType getType() {
        return ItemType.ACCESSORY;
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


    @Override
    public String toString() {
        return "fight.items.Accessories{" +
                "dropName='" + name + '\'' +
                ", effect=" + effect +
                '}';
    }
}
