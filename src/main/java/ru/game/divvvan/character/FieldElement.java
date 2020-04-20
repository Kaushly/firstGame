package ru.game.divvvan.character;

import ru.game.divvvan.field.Coordinate;

public interface FieldElement {
    void action(Person person);

    FieldType getType();

    Coordinate getCoordinate();

    String getSymbol();
}
