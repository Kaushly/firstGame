package gamefight.character.monster;

import java.util.Random;

public class Doppelganger extends Monster {

    public Doppelganger() {
        super((int) (Math.random() * 50) + 10, new Random().nextInt(3) + 3,new Random().nextInt(10) + 5);
    }

    @Override
    public Monster clone() {
        return new Doppelganger();
    }

    @Override
    public TypeMonster getTypeMonster() {
        return TypeMonster.DOPPELGANGER;
    }
}
