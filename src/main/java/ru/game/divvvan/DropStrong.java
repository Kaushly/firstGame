package ru.game.divvvan;

public class DropStrong {
    private String DropName;
    private int weight;
    private int bonusStrong;

    public DropStrong(String DropName, int weight, int bonusStrong){
        this.DropName = DropName;
        this.weight = weight;
        this.bonusStrong = bonusStrong;
    }

    public String getDropName() {
        return DropName;
    }

    public void setDropName(String dropName) {
        DropName = dropName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getBonusStrong() {
        return bonusStrong;
    }

    public void setBonusStrong(int bonusStrong) {
        this.bonusStrong = bonusStrong;
    }
}
