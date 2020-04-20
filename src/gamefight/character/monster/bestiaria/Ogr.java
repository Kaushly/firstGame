package gamefight.character.monster.bestiaria;

import gamefight.character.monster.Monster;
import gamefight.character.monster.TypeMonster;

import java.util.Random;

public class Ogr extends Monster {

    public Ogr() {
        super((int) (Math.random() * 50) + 10,
                new Random().nextInt(3) + 3,
                new Random().nextInt(10) + 5);
    }

    @Override
    public Monster clone() {
        return new Ogr();
    }

    @Override
    public TypeMonster getTypeMonster() {
        return TypeMonster.OGR;
    }
}
