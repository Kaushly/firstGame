package gamefight.zone;

import gamefight.character.FieldElement;
import gamefight.character.FieldType;
import gamefight.character.Person;
import gamefight.character.PersonField;
import gamefight.field.Coordinate;
import gamefight.field.Field;

import java.util.ArrayList;
import java.util.List;

public class Zone {

    private Person orc = getFirstEnemy();
    private PersonField personField;
    private Field field = new Field(5, 5, 5, 3);
    private Coordinate coordinateOnMap;

    public Zone(Coordinate coordinateOnMap) {
        this.coordinateOnMap = coordinateOnMap;
    }

    public Person getFirstEnemy() {
        Person orc = new Person("Trall");
        orc.setHp(orc.getHp() + (int) (Math.random() * 10));
        orc.setAttack(orc.getAttack() + (int) (Math.random() * 10));
        orc.setDefense(orc.getDefense() + (int) (Math.random() * 10));
        return orc;
    }

    @Override
    public String toString() {
        return "fight.zone.RedWood{" +
                "orc=" + orc +
                '}';
    }

    public void drawField() {
        field.drawField();
    }

    public void initField(Person person) {
        PersonField personField = new PersonField(new Coordinate(field.getWight() / 2, field.getHeight() - 1));
        personField.setPerson(person);
        field.initField(personField);
        this.personField = personField;
    }

    public Field getField() {
        return field;
    }
    // 1 2 3
    // 4 5 6
    // 7 8 9


    public Coordinate getCoordinateOnMap() {
        return coordinateOnMap;
    }

    public PersonField getPersonField() {
        return personField;
    }
}


