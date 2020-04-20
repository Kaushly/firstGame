package gamefight.character.monster.bestiaria;

import gamefight.character.monster.Monster;
import gamefight.character.monster.TypeMonster;

import java.util.Random;

public class Ghoul extends Monster {

    public Ghoul() {
        super((int) (Math.random() * 50) + 10, new Random().nextInt(3) + 3,new Random().nextInt(10) + 5);
    }

    @Override
    public Monster clone() {
        return new Ghoul();
    }

    @Override
    public TypeMonster getTypeMonster() {
        return TypeMonster.GHOUL;
    }
}
