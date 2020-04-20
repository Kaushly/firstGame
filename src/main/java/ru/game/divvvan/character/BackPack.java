package ru.game.divvvan.character;

import lombok.Data;
import ru.game.divvvan.items.RealItem;

import java.util.ArrayList;
import java.util.List;

@Data
public class BackPack {
    private int size;
    private int weight;
    private List<RealItem> itemsList = new ArrayList<>();


    public void addItem(RealItem realItem) {
        itemsList.add(realItem);
    }

    @Override
    public String toString() {
        return "BackPack{" +
                "size=" + size +
                ", weight=" + weight +
                ", itemsList=" + itemsList +
                '}';
    }
}
