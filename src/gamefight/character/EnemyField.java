package gamefight.character;

import gamefight.field.Coordinate;
import gamefight.menu.ActionZone;

public class EnemyField implements FieldElement {

    private Enemy enemy;
    private ActionZone actionZone = new ActionZone();

    private Coordinate coordinate;

    public EnemyField(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    @Override
    public void action(Person person) {
        person.setCurrentEnemy(enemy);
        actionZone.battle(person);
    }

    @Override
    public FieldType getType() {
        return FieldType.MONSTER;
    }

    @Override
    public Coordinate getCoordinate() {
        return coordinate;
    }

    @Override
    public String getSymbol() {
        return "M";
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }
}
