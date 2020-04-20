package ru.game.divvvan.items;

import lombok.Data;

@Data
public class LoadItem {
    private Weapon left;
    private Weapon right;
    private Armor helmet;
    private Armor body;
    private Armor shoes;
    private Armor cloak;
    private Armor glover;
    private Accessories first;
    private Accessories second;
    private Accessories third;
}
