package ru.game.divvvan.character;

import lombok.Data;

@Data
public class Drop {
    private long coin;
    private int experience;


    public Drop(long coin, int experience) {
        this.coin = coin;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Drop{" +
                "coin=" + coin +
                ", exp=" + experience +
                '}';
    }
}
