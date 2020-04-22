package ru.game.divvvan.character.monster.bestiaria.floor4;

import ru.game.divvvan.character.monster.Monster;
import ru.game.divvvan.character.monster.TypeMonster;

import java.util.Random;

public class Warewolf extends Monster {

    public Warewolf() {
        super((int) (Math.random() * 10) + 30, new Random().nextInt(10) + 7, new Random().nextInt(10) + 5);
    }

    @Override
    public Monster clone() {
        return new Warewolf();
    }

    @Override
    public TypeMonster getTypeMonster() {
        return TypeMonster.WAREWOLF;
    }
}
