package gamefight.character.monster.bestiaria;

import gamefight.character.monster.Monster;
import gamefight.character.monster.TypeMonster;

import java.util.Random;

public class Goblin extends Monster {
    public Goblin() {
        super(new Random().nextInt(30) + 80, new Random().nextInt(5) + 7, new Random().nextInt(10) + 5);
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
