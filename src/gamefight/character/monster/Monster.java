package gamefight.character.monster;

import gamefight.character.Enemy;
import gamefight.character.Person;

public abstract class Monster {
    private int hp;
    private int attack;
    private int exp;

    public Monster(int hp, int attack, int exp) {
        this.hp = hp;
        this.attack = attack;
        this.exp = exp;
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public abstract TypeMonster getTypeMonster();

    public abstract Monster clone();

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public void strike(Enemy person) {
        person.minusHp(attack);
    }

    public void strike(Person person) {
        person.minusHp(attack);
    }

    public void minusHp(int attack) {
        hp = Math.max(hp - attack, 0);

    }

    @Override
    public String toString() {
        return "Monster{" +
                "hp=" + hp +
                ", attack=" + attack +
                ", typeMonster=" + getTypeMonster() +
                '}';
    }
}
