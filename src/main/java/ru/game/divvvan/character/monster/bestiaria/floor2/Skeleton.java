package ru.game.divvvan.character.monster.bestiaria.floor2;

import ru.game.divvvan.character.monster.Monster;
import ru.game.divvvan.character.monster.TypeMonster;

import java.util.Random;

public class Skeleton extends Monster {

    public Skeleton() {
        super((int) (Math.random() * 10) + 35, new Random().nextInt(10) + 15,new Random().nextInt(10) + 10);
    }

    @Override
    public Monster clone() {
        return new Skeleton();
    }

    @Override
    public TypeMonster getTypeMonster() {
        return TypeMonster.SKELETON;
    }
}
