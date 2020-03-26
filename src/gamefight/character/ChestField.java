package gamefight.character;

import gamefight.field.Coordinate;

public class ChestField implements FieldElement {

    private Coordinate coordinate;

    public ChestField(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    @Override
    public void action(Person person) {

    }

    @Override
    public FieldType getType() {
        return FieldType.CHEST;
    }

    @Override
    public Coordinate getCoordinate() {
        return coordinate;
    }

    @Override
    public String getCharacter() {
        return "П";
    }
}
