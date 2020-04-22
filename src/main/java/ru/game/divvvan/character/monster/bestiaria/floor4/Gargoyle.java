package ru.game.divvvan.character.monster.bestiaria.floor4;

import ru.game.divvvan.character.monster.Monster;
import ru.game.divvvan.character.monster.TypeMonster;

import java.util.Random;

public class Gargoyle extends Monster {

    public Gargoyle() {
        super((int) (Math.random() * 50) + 10, new Random().nextInt(3) + 3,new Random().nextInt(10) + 5);
    }

    @Override
    public Monster clone() {
        return new Gargoyle();
    }

    @Override
    public TypeMonster getTypeMonster() {
        return TypeMonster.GARGOYLE;
    }
}
