package ru.game.divvvan.character.monster.bestiaria.floor2;

import ru.game.divvvan.character.monster.Monster;
import ru.game.divvvan.character.monster.TypeMonster;

import java.util.Random;

public class Wolf extends Monster {

    public Wolf() {
        super((int) (Math.random() * 20) + 40, new Random().nextInt(15) + 7, new Random().nextInt(10) + 10);
    }

    @Override
    public Monster clone() {
        return new Wolf();
    }

    @Override
    public TypeMonster getTypeMonster() {
        return TypeMonster.WOLF;
    }
}
