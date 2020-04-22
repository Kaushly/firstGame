package ru.game.divvvan.character;

import lombok.Data;
import ru.game.divvvan.character.monster.Monster;
import ru.game.divvvan.field.Coordinate;
import ru.game.divvvan.field.Field;
import ru.game.divvvan.items.LoadItem;
import ru.game.divvvan.items.RealItem;

@Data
public class Person implements FieldElement {

    private String name;
    private int defense;  // броня
    private int hp;
    private int fullHp;
    private int strong;
    private int attack;
    private Coordinate coordinate;
    private Enemy currentEnemy;
    private Field currentField;
    private Tower tower;
    private BackPack backPack;
    private LoadItem loadItem;
    private long coin;
    private int experience;
    private int level;

    public Person(String name) {
        this.name = name;
        this.defense = 15;
        this.hp = 100;
        this.fullHp = hp;
        this.strong = 20;
        this.attack = 10;
        this.level = 1;
        this.experience = 0;
        backPack = new BackPack();
        loadItem = new LoadItem();
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public void take(RealItem realItem) {
        backPack.addItem(realItem);
    }

    public void strike(Enemy person) {
        person.minusHp(attack);
    }

    public void strike(Monster monster) {
        monster.minusHp(attack);
    }

    public void strike(Person person) {
        person.minusHp(attack);
    }

    public void minusHp(int attack) {
        hp = hp - attack;
    }

    @Override
    public void action(Person person) {

    }

    @Override
    public FieldType getType() {
        return null;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    @Override
    public String getSymbol() {
        return "O";
    }
}



