package gamefight.character.monster.bestiaria;

import gamefight.character.monster.Monster;
import gamefight.character.monster.TypeMonster;

import java.util.Random;

public class Demon extends Monster {

    public Demon() {
        super(new Random().nextInt(50) + 50, new Random().nextInt(3) + 7, new Random().nextInt(10) + 5);
    }

    @Override
    public Monster clone() {
        return new Demon();
    }

    @Override
    public TypeMonster getTypeMonster() {
        return TypeMonster.DEMON;
    }
}
