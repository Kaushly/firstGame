package gamefight.character;

import gamefight.DropStrong;
import gamefight.field.Coordinate;
import gamefight.field.Field;
import gamefight.items.Accessories;
import gamefight.items.Armor;
import gamefight.items.Weapon;

public class Person implements FieldElement {

    private String name;
    private int defense;  // броня
    private int hp;
    private int fullHp;
    private int strong;
    private int attack;
    private Weapon weapon;
    private Accessories accessories;
    private Armor armor;
    private DropStrong dropStrong;
    private boolean alive = true;
    private Coordinate coordinate;
    private Enemy currentEnemy;
    private Field currentField;
    private Tower tower;
    private BackBack backBack;
    private long coin;
    private int level;

    public Person(String name) {
        this.name = name;
        this.defense = 15;
        this.hp = 100;
        this.fullHp = hp;
        this.strong = 20;
        this.attack = 40;
    }

    @Override
    public String toString() {
        return name +
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

    public void strike(Enemy person) {
        person.minusHp(attack);
    }

    public void strike(Person person) {
        person.minusHp(attack);
    }

    public void minusHp(int attack) {
        hp = hp - attack;
        if (hp <= 0) {
            alive = false;
        }
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

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public Enemy getCurrentEnemy() {
        return currentEnemy;
    }

    public void setCurrentEnemy(Enemy currentEnemy) {
        this.currentEnemy = currentEnemy;
    }

    public Field getCurrentField() {
        return currentField;
    }

    public void setCurrentField(Field currentField) {
        this.currentField = currentField;
    }

    public Tower getTower() {
        return tower;
    }

    public void setTower(Tower tower) {
        this.tower = tower;
    }

    public int getFullHp() {
        return fullHp;
    }

    public void setFullHp(int fullHp) {
        this.fullHp = fullHp;
    }

    public BackBack getBackBack() {
        return backBack;
    }

    public void setBackBack(BackBack backBack) {
        this.backBack = backBack;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public long getCoin() {
        return coin;
    }

    public void setCoin(long coin) {
        this.coin = coin;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}



