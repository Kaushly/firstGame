package gamefight.character.monster;

import java.util.Random;

public class Goblin extends Monster {
    public Goblin() {
        super(new Random().nextInt(30) + 80, new Random().nextInt(5) + 7);
    }

    @Override
    public TypeMonster getTypeMonster() {
        return TypeMonster.GOBLIN;
    }

    @Override
    public Monster clone() {
        return new Goblin();
    }
}
