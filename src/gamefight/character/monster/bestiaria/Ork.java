package gamefight.character.monster.bestiaria;

import gamefight.character.monster.Monster;
import gamefight.character.monster.TypeMonster;

import java.util.Random;

public class Ork extends Monster {

    public Ork() {
        super((int) (Math.random() * 10) + 30, new Random().nextInt(10) + 7, new Random().nextInt(10) + 5);
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
