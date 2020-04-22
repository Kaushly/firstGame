package ru.game.divvvan.character.monster.bestiaria.floor8;

import ru.game.divvvan.character.monster.Monster;
import ru.game.divvvan.character.monster.TypeMonster;

import java.util.Random;

public class Manticure extends Monster {

    public Manticure() {
        super((int) (Math.random() * 50) + 10, new Random().nextInt(3) + 3,new Random().nextInt(10) + 5);
    }

    @Override
    public Monster clone() {
        return new Manticure();
    }

    @Override
    public TypeMonster getTypeMonster() {
        return TypeMonster.MANTICURE;
    }
}
