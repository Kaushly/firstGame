package ru.game.divvvan.character.monster.bestiaria.floor3;

import ru.game.divvvan.character.monster.Monster;
import ru.game.divvvan.character.monster.TypeMonster;

import java.util.Random;

public class Zombi extends Monster {

    public Zombi() {
        super((int) (Math.random() * 30) + 60, new Random().nextInt(10) + 15,new Random().nextInt(10) + 20);
    }

    @Override
    public Monster clone() {
        return new Zombi();
    }

    @Override
    public TypeMonster getTypeMonster() {
        return TypeMonster.ZOMBI;
    }
}
