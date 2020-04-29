package ru.game.divvvan.items;

import lombok.Data;
import ru.game.divvvan.factory.Effect;

import java.util.List;

import static ru.game.divvvan.items.ItemType.ARMOR;
@Data
public class Armor implements RealItem {

    private String name;
    private int weight;
    private List<Effect> effect;
    private long price;

    public Armor(String name, int weight, List<Effect> effect, long price) {
        this.name = name;
        this.weight = weight;
        this.effect = effect;
        this.price = price;
    }
    @Override
    public ItemType getType() {
        return ARMOR;
    }


}
