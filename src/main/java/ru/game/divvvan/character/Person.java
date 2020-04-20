package ru.game.divvvan.character;

import ru.game.divvvan.character.monster.Monster;
import ru.game.divvvan.field.Coordinate;
import ru.game.divvvan.field.Field;
import ru.game.divvvan.items.LoadItem;
import ru.game.divvvan.items.RealItem;

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
        this.attack = 40;
        this.level = 1;
        this.experience = 0;
        backPack = new BackPack();
        loadItem = new LoadItem();
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

    public boolean isAlive() {
        return hp > 0;
    }

    public void take(RealItem realItem){
        backPack.addItem(realItem);
    }

    public LoadItem getLoadItem() {
        return loadItem;
    }

    public void setLoadItem(LoadItem loadItem) {
        this.loadItem = loadItem;
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

    public BackPack getBackPack() {
        return backPack;
    }

    public void setBackPack(BackPack backPack) {
        this.backPack = backPack;
    }

    public long getCoin() {
        return coin;
    }

    public void setCoin(long coin) {
        this.coin = coin;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", defense=" + defense +
                ", hp=" + hp +
                ", fullHp=" + fullHp +
                ", strong=" + strong +
                ", attack=" + attack +
                ", coordinate=" + coordinate +
                ", currentEnemy=" + currentEnemy +
                ", currentField=" + currentField +
                ", backBack=" + backPack +
                ", coin=" + coin +
                ", experience=" + experience +
                ", level=" + level +
                '}';
    }
}



