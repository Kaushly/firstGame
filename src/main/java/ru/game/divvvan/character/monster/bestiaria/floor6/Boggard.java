package ru.game.divvvan.character.monster.bestiaria.floor6;

import ru.game.divvvan.character.monster.Monster;
import ru.game.divvvan.character.monster.TypeMonster;

import java.util.Random;

public class Boggard extends Monster {

    public Boggard() {
        super(new Random().nextInt(50) + 50,
                new Random().nextInt(3) + 7,
                new Random().nextInt(10) + 5);
    }

    @Override
    public Monster clone() {
        return new Boggard();
    }

    @Override
    public TypeMonster getTypeMonster() {
        return TypeMonster.BOGGARD;
    }
}
