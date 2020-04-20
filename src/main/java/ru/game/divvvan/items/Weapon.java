package ru.game.divvvan.items;

public class Weapon implements RealItem {//POJO class

    private String name;
    private int damage;
    private int weight;
    private ItemType type;

    public Weapon(String name, int damage, int weight, ItemType type) {
        this.name = name;
        this.damage = damage;
        this.weight = weight;
        this.type = type;
    }

    @Override
    public String toString() {
        return
                " title = '" + name + '\'' +
                        ", damage = " + damage +
                        ", weight = " + weight +
                        ", type = '" + type + '\'';
    }

    public void info() {
        System.out.println("Назвние: " + name + "\nУрон: " + damage + "\nВес:" +
                " " + weight + "\nТип: " + type + "\nСила: ");
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

    public ItemType getType() {
        return type;
    }
}//todo  contrl +Enter

