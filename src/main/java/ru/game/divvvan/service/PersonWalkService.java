package ru.game.divvvan.service;

import ru.game.divvvan.character.EmptyField;
import ru.game.divvvan.character.FieldElement;
import ru.game.divvvan.character.Person;
import ru.game.divvvan.field.Coordinate;
import ru.game.divvvan.field.Field;

public class PersonWalkService {
    private FieldElement[][] fieldElements;

    public void go(Person person, Coordinate oldCoordinate) {
        Coordinate coordinate = person.getCoordinate();
        fieldElements = person.getCurrentField().getFieldElements();
        if (checkBorderZone(coordinate, person.getCurrentField())) {
            System.out.println("Вы перемащаетесь на координаты " + coordinate);

            this.fieldElements[coordinate.getX()][coordinate.getY()].action(person);
            this.fieldElements[coordinate.getX()][coordinate.getY()] = person;
            this.fieldElements[oldCoordinate.getX()][oldCoordinate.getY()] = new EmptyField(new Coordinate(oldCoordinate.getX(), oldCoordinate.getY()));
        } else {
            System.out.println("Вы вступили на запретную зону");
            person.setCoordinate(oldCoordinate);
        }
    }

    private boolean checkBorderZone(Coordinate coordinate, Field currentField) {
        return coordinate.getX() < currentField.getWight() && coordinate.getY() < currentField.getHeight() && coordinate.getY() >= 0
                && coordinate.getX() >= 0;
    }
}

