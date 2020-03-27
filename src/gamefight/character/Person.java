package gamefight.character;

import gamefight.DropStrong;
import gamefight.Factory.Effect;
import gamefight.Factory.EffectType;
import gamefight.items.Accessories;
import gamefight.items.Armor;
import gamefight.items.Weapon;

public class Person {

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

    public Person(String name) {
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
        return  name +
                ", defense=" + defense +
                ", hp=" + hp +
                ", strong=" + strong +
                ", attack=" + attack +
                ", weapon=" + weapon +
                ", accessories=" + accessories +
                ", armor=" + armor +
                ", dropStrong=" + dropStrong +
                ", alive=" + alive;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getStrong() {
        return strong;
    }

    public void setStrong(int strong) {
        this.strong = strong;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Accessories getAccessories() {
        return accessories;
    }

    public void setAccessories(Accessories accessories) {
        this.accessories = accessories;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public DropStrong getDropStrong() {
        return dropStrong;
    }

    public void setDropStrong(DropStrong dropStrong) {
        this.dropStrong = dropStrong;
    }

    public boolean isAlive() {
        return alive;
    }

    public void strike(Person person) {
        person.minusHp(attack);
    }

    private void minusHp(int attack) {
        hp = hp - attack;
        if (hp <= 0) {
            alive = false;
        }
    }
}



