package ru.game.divvvan.character.monster.bestiaria;

import ru.game.divvvan.character.monster.Monster;
import ru.game.divvvan.character.monster.TypeMonster;

import java.util.Random;

public class Snakeman extends Monster {

    public Snakeman() {
        super((int) (Math.random() * 50) + 10, new Random().nextInt(3) + 3,new Random().nextInt(10) + 5);
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
