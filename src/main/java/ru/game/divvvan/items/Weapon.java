package ru.game.divvvan.items;

public class Weapon {//POJO class

    private String name;
    private int damage;
    private int weight;
    private String type;
    private int strength;

    public Weapon(String name, int damage, int weight, String type, int strength){
        this.name = name;
        this.damage = damage;
        this.weight = weight;
        this.type = type;
        this.strength = strength;
    }

    @Override
    public String toString() {
        return
                " title = '" + name + '\'' +
                ", damage = " + damage +
                ", weight = " + weight +
                ", type = '" + type + '\'' +
                ", strength = " + strength;
    }

    public void info() {
        System.out.println("Назвние: " + name + "\nУрон: " + damage + "\nВес:" +
                " " + weight + "\nТип: " + type + "\nСила: " + strength + "\n");
    }

    public String getName() {
        return name;
    }

    public void setName(String DropName) {
        this.name = DropName;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}//todo  contrl +Enter

