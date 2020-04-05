package gamefight.service;

import gamefight.character.EmptyField;
import gamefight.character.FieldElement;
import gamefight.character.Person;
import gamefight.field.Coordinate;

import static gamefight.Constants.WORLD_MAP;

public class PersonWalkService {
    private FieldElement[][] fieldElements;

    public void go(Person person, Coordinate oldCoordinate)  {
        Coordinate coordinate = person.getCoordinate();
        fieldElements = WORLD_MAP.getCurrentZone().getField().getFieldElements();
        if (checkBorderZone(coordinate)) {
            System.out.println("Вы перемащаетесь на координаты " + coordinate);

            fieldElements[coordinate.getX()][coordinate.getY()].action(person);
            fieldElements[coordinate.getX()][coordinate.getY()] = person;
            fieldElements[oldCoordinate.getX()][oldCoordinate.getY()] = new EmptyField(new Coordinate(oldCoordinate.getX(), oldCoordinate.getY()));
        } else {
            System.out.println("Вы вступили на запретную зону");
            person.setCoordinate(oldCoordinate);
        }
    }

    private boolean checkBorderZone(Coordinate coordinate) {
        return coordinate.getX() < WORLD_MAP.getCurrentZone().getField().getWight() && coordinate.getY() < WORLD_MAP.getCurrentZone().getField().getHeight() && coordinate.getY() >= 0
                && coordinate.getX() >= 0;
    }
}

