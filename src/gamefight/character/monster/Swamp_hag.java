package gamefight.character.monster;

import java.util.Random;

public class Swamp_hag extends Monster {

    public Swamp_hag() {
        super((int) (Math.random() * 10) + 30, new Random().nextInt(10) + 7, new Random().nextInt(10) + 5);
    }

    @Override
    public Monster clone() {
        return new Swamp_hag();
    }

    @Override
    public TypeMonster getTypeMonster() {
        return TypeMonster.SWAMP_HAG;
    }
}
