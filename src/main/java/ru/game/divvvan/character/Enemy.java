package ru.game.divvvan.character;

import lombok.Data;
import ru.game.divvvan.DropStrong;
import ru.game.divvvan.factory.Effect;
import ru.game.divvvan.factory.EffectType;
import ru.game.divvvan.field.Coordinate;
import ru.game.divvvan.items.Accessories;
import ru.game.divvvan.items.Armor;
import ru.game.divvvan.items.Weapon;

@Data
public class Enemy {

    private String name;
    private int defense;  // броня
    private int hp;
    private int strong;
    private int attack;
    private Weapon weapon;
    private Accessories accessories;
    private Armor armor;
    private DropStrong dropStrong;
    private boolean alive = true;
    private Coordinate coordinate;

    public Enemy(String name) {
        this.name = name;
        this.defense = 15;
        this.hp = 100;
        this.strong = 20;
        this.attack = 5;
    }

    public int getFullDamage() {
        if (weapon == null) {
            return attack;
        }
        return attack + weapon.getDamage();
    }

    public int getFullArmor() {
        if (armor == null || armor.getEffect() == null) {
            return defense;
        }
        for (Effect effect : armor.getEffect()) {
            if (EffectType.DEFFENCE.equals(effect.getType())) {
                return defense + effect.getValue();
            }
        }
        return defense;
    }

    public int getFullStrong() {
        if (dropStrong == null) {
            return strong;
        }
        return strong + dropStrong.getBonusStrong();
    }

    @Override
    public String toString() {
        return "fight.character.Person{" +
                "name='" + name + '\'' +
                ", defense=" + defense +
                ", hp=" + hp +
                ", strong=" + strong +
                ", attack=" + attack +
                ", weapon=" + weapon +
                ", accessories=" + accessories +
                ", armor=" + armor +
                ", dropStrong=" + dropStrong +
                ", alive=" + alive +
                '}';
    }

    public void strike(Person enemy) {
        enemy.minusHp(attack);
    }

    public void minusHp(int attack) {
        hp = hp - attack;
        if (hp <= 0) {
            alive = false;
        }
    }
}



