package gamefight.character;

import gamefight.character.monster.Monster;

public class Tower {
    private int level = 1;
    public Monster currentMonster;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Monster getCurrentMonster() {
        return currentMonster;
    }

    public void setCurrentMonster(Monster currentMonster) {
        this.currentMonster = currentMonster;
    }
}
