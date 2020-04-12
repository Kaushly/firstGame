package gamefight.character.monster;

import java.util.Random;

public class Ghost extends Monster {

    public Ghost() {
        super((int) (Math.random() * 50) + 10, new Random().nextInt(3) + 3);
    }

    @Override
    public Monster clone() {
        return new Ghost();
    }

    @Override
    public TypeMonster getTypeMonster() {
        return TypeMonster.GHOST;
    }
}
