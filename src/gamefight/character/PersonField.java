package gamefight.character;

import gamefight.field.Coordinate;

public class PersonField implements FieldElement {

    private Person person;

    private Coordinate coordinate;

    public PersonField(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    @Override
    public void action(Person person) {

    }

    @Override
    public FieldType getType() {
        return FieldType.MONSTER;
    }

    @Override
    public Coordinate getCoordinate() {
        return coordinate;
    }

    @Override
    public String getSymbol() {
        return "O";
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }
}
