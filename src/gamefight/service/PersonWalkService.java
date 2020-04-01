package gamefight.service;

import gamefight.character.EmptyField;
import gamefight.character.FieldElement;
import gamefight.character.PersonField;
import gamefight.field.Coordinate;
import gamefight.field.WorldMap;

public class PersonWalkService {
    private PersonField personField;
    private WorldMap worldMap;
    private FieldElement[][] fieldElements;

    public PersonWalkService(WorldMap worldMap) {
        this.personField = worldMap.getCurrentZone().getPersonField();
        this.worldMap = worldMap;
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
        fieldElements = worldMap.getCurrentZone().getField().getFieldElements();
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
        return coordinate.getX() < worldMap.getCurrentZone().getField().getWight() && coordinate.getY() < worldMap.getCurrentZone().getField().getHeight() && coordinate.getY() >= 0
                && coordinate.getX() >= 0;
    }
}

