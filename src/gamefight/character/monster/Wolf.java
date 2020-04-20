package gamefight.character.monster;

import java.util.Random;

public class Wolf extends Monster {

    public Wolf() {
        super((int) (Math.random() * 10) + 30, new Random().nextInt(10) + 7, new Random().nextInt(10) + 5);
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
