package ru.game.divvvan.items;

import lombok.Data;

@Data
public class Weapon implements RealItem {

    private String name;
    private int damage;
    private int weight;
    private ItemType type;
    private long price;

    public Weapon(String name, int damage, int weight, ItemType type, long price) {
        this.name = name;
        this.damage = damage;
        this.weight = weight;
        this.type = type;
        this.price = price;
    }
}

