package ru.game.divvvan.character;

import ru.game.divvvan.field.Coordinate;

public class EmptyField implements FieldElement {

    private Coordinate coordinate;

    public EmptyField(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    @Override
    public void action(Person person) {

    }

    @Override
    public FieldType getType() {
        return FieldType.EMPTY;
    }

    @Override
    public Coordinate getCoordinate() {
        return coordinate;
    }

    @Override
    public String getSymbol() {
        return "*";
    }
}
