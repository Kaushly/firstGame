package gamefight.character.monster;

import java.util.Random;

public class Skeleton extends Monster {

    public Skeleton() {
        super((int) (Math.random() * 50) + 10, new Random().nextInt(3) + 3,new Random().nextInt(10) + 5);
    }

    @Override
    public Monster clone() {
        return new Skeleton();
    }

    @Override
    public TypeMonster getTypeMonster() {
        return TypeMonster.SKELETON;
    }
}
