package gamefight.character;

public class Tower {
    private int level = 1;
    private Person currentEnemy;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Person getCurrentEnemy() {
        return currentEnemy;
    }

    public void setCurrentEnemy(Person currentEnemy) {
        this.currentEnemy = currentEnemy;
    }
}
