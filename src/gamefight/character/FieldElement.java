package gamefight.character;

import gamefight.field.Coordinate;

public interface FieldElement {
    void action(Person person);

    FieldType getType();

    Coordinate getCoordinate();

    String getSymbol();
}
