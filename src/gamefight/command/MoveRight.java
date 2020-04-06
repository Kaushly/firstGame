package gamefight.command;

import gamefight.character.Person;
import gamefight.field.Coordinate;
import gamefight.service.PersonWalkService;

public class MoveRight implements Command {
    private PersonWalkService service = new PersonWalkService();

    @Override
    public void execute(Person person) {
        Coordinate coordinate = person.getCoordinate();
        Coordinate oldCoordinate = new Coordinate(coordinate.getX(), coordinate.getY());
        coordinate.setX(coordinate.getX() + 1);
        service.go(person, oldCoordinate);

    }

    @Override
    public String name() {
        return "Вправо";
    }
}
