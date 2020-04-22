package ru.game.divvvan.character.monster.bestiaria.floor1;

import ru.game.divvvan.character.monster.Monster;
import ru.game.divvvan.character.monster.TypeMonster;

import java.util.Random;

public class Goblin extends Monster {
    public Goblin() {
        super(new Random().nextInt(10) + 30, new Random().nextInt(5) + 7, new Random().nextInt(10) + 5);
    }

    @Override
    public TypeMonster getTypeMonster() {
        return TypeMonster.GOBLIN;
    }

    @Override
    public Monster clone() {
        return new Goblin();
    }
}
