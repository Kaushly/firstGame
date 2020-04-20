package ru.game.divvvan.service;

import ru.game.divvvan.character.FieldElement;
import ru.game.divvvan.character.FieldType;
import ru.game.divvvan.character.Person;
import ru.game.divvvan.field.Coordinate;

public class FieldService {

    public boolean isCloseEnemy(Person person) {
        Coordinate coordinate = person.getCoordinate();
        FieldElement[][] fieldElements = person.getCurrentField().getFieldElements();
        try {
            if (fieldElements[coordinate.getX() + 1][coordinate.getY()].getType() == FieldType.MONSTER ||
                    fieldElements[coordinate.getX()][coordinate.getY() + 1].getType() == FieldType.MONSTER ||
                    fieldElements[coordinate.getX() - 1][coordinate.getY()].getType() == FieldType.MONSTER ||
                    fieldElements[coordinate.getX()][coordinate.getY() - 1].getType() == FieldType.MONSTER) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }
}
