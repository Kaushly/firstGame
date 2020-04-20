package ru.game.divvvan.zone;

import ru.game.divvvan.character.Person;
import ru.game.divvvan.field.Coordinate;
import ru.game.divvvan.field.Field;

public class Zone {

    private Person orc = getFirstEnemy();
    private Person person;
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
        person.setCoordinate(new Coordinate(field.getWight() / 2, field.getHeight() - 1));
        field.initField(person);
        this.person = person;
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


    public Person getPerson() {
        return person;
    }
}


