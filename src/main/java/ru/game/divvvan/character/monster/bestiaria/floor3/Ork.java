package ru.game.divvvan.character.monster.bestiaria.floor3;

import ru.game.divvvan.character.monster.Monster;
import ru.game.divvvan.character.monster.TypeMonster;

import java.util.Random;

public class Ork extends Monster {

    public Ork() {
        super((int) (Math.random() * 10) + 50, new Random().nextInt(10) + 20, new Random().nextInt(10) + 20);
    }

    @Override
    public Monster clone() {
        return new Ork();
    }

    @Override
    public TypeMonster getTypeMonster() {
        return TypeMonster.ORK;
    }
}
