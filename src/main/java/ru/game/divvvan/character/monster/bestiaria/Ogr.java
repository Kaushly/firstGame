package ru.game.divvvan.character.monster.bestiaria;

import ru.game.divvvan.character.monster.Monster;
import ru.game.divvvan.character.monster.TypeMonster;

import java.util.Random;

public class Ogr extends Monster {

    public Ogr() {
        super((int) (Math.random() * 50) + 10,
                new Random().nextInt(3) + 3,
                new Random().nextInt(10) + 5);
    }

    @Override
    public Monster clone() {
        return new Ogr();
    }

    @Override
    public TypeMonster getTypeMonster() {
        return TypeMonster.OGR;
    }
}
