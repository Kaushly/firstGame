package ru.game.divvvan.character.monster.bestiaria.floor2;

import ru.game.divvvan.character.monster.Monster;
import ru.game.divvvan.character.monster.TypeMonster;

import java.util.Random;

public class Ghost extends Monster {

    public Ghost() {
        super((int) (Math.random() * 20) + 30, new Random().nextInt(10) + 12,new Random().nextInt(10) + 10);
    }

    @Override
    public Monster clone() {
        return new Ghost();
    }

    @Override
    public TypeMonster getTypeMonster() {
        return TypeMonster.GHOST;
    }
}
