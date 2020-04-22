package ru.game.divvvan.character.monster.bestiaria.floor3;

import ru.game.divvvan.character.monster.Monster;
import ru.game.divvvan.character.monster.TypeMonster;

import java.util.Random;

public class Snakeman extends Monster {

    public Snakeman() {
        super((int) (Math.random() * 10) + 40, new Random().nextInt(10) + 25,new Random().nextInt(10) + 20);
    }

    @Override
    public Monster clone() {
        return new Snakeman();
    }

    @Override
    public TypeMonster getTypeMonster() {
        return TypeMonster.SNAKEMAN;
    }
}
