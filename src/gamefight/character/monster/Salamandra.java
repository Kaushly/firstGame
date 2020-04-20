package gamefight.character.monster;

import java.util.Random;

public class Salamandra extends Monster {

    public Salamandra() {
        super((int) (Math.random() * 50) + 10, new Random().nextInt(3) + 3,new Random().nextInt(10) + 5);
    }

    @Override
    public Monster clone() {
        return new Salamandra();
    }

    @Override
    public TypeMonster getTypeMonster() {
        return TypeMonster.SALAMANDRA;
    }
}
