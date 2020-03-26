package gamefight.character;

import gamefight.field.Coordinate;

public class EmptyField implements FieldElement {
    @Override
    public void action(Person person) {

    }

    @Override
    public FieldType getType() {
        return FieldType.EMPTY;
    }

    @Override
    public Coordinate getCoordinate() {
        return null;
    }

    @Override
    public String getCharacter() {
        return "*";
    }
}
