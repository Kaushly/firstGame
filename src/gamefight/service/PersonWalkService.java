package gamefight.service;

import gamefight.character.EmptyField;
import gamefight.character.FieldElement;
import gamefight.character.PersonField;
import gamefight.field.Coordinate;

import static gamefight.Constants.WORLD_MAP;

public class PersonWalkService {
    private PersonField personField;
    private FieldElement[][] fieldElements;

    public PersonWalkService() {
        this.personField = WORLD_MAP.getCurrentZone().getPersonField();
    }

    public void goUp() {
        personField.getCoordinate().up();
        go(personField);
    }

    public void goDown() {
        personField.getCoordinate().down();
        go(personField);
    }

    public void goLeft() {
        personField.getCoordinate().left();
        go(personField);
    }

    public void goRight() {
        personField.getCoordinate().right();
        go(personField);
    }


    public void go(PersonField personField) {
        Coordinate coordinate = personField.getCoordinate();
        fieldElements = WORLD_MAP.getCurrentZone().getField().getFieldElements();
        if (checkBorderZone(coordinate)) {
            System.out.println("Вы перемащаетесь на координаты " + coordinate);

            fieldElements[coordinate.getX()][coordinate.getY()].action(personField.getPerson());
            fieldElements[coordinate.getX()][coordinate.getY()] = personField;
            fieldElements[coordinate.getPrevX()][coordinate.getPrevY()] = new EmptyField(new Coordinate(coordinate.getPrevX(), coordinate.getPrevY()));
        } else {

            coordinate.clearCoordinate();
            System.out.println("Вы вступили на запретную зону");
        }
    }

    private boolean checkBorderZone(Coordinate coordinate) {
        return coordinate.getX() < WORLD_MAP.getCurrentZone().getField().getWight() && coordinate.getY() < WORLD_MAP.getCurrentZone().getField().getHeight() && coordinate.getY() >= 0
                && coordinate.getX() >= 0;
    }
}

