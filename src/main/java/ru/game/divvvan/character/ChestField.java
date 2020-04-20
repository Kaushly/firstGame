package ru.game.divvvan.character;

import ru.game.divvvan.field.Coordinate;

public class ChestField implements FieldElement {

    private Coordinate coordinate;

    public ChestField(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    @Override
    public void action(Person person) {
        System.out.println("Вы открыли сундук");
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
    public String getSymbol() {
        return "П";
    }
}
