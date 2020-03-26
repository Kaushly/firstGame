package gamefight.character;

import gamefight.field.Coordinate;

public class EnemyField implements FieldElement {

    private Enemy enemy;

    private Coordinate coordinate;

    public EnemyField(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    @Override
    public void action(Person person) {

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
    public String getCharacter() {
        return "M";
    }
}
