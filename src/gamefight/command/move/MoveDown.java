package gamefight.command.move;

import gamefight.character.Person;
import gamefight.command.Command;
import gamefight.field.Coordinate;
import gamefight.service.PersonWalkService;

public class MoveDown implements Command {
    private PersonWalkService service = new PersonWalkService();

    @Override
    public void execute(Person person) {
        Coordinate coordinate = person.getCoordinate();
        Coordinate oldCoordinate = new Coordinate(coordinate.getX(), coordinate.getY());
        coordinate.setY(coordinate.getY() + 1);
        service.go(person, oldCoordinate);
    }

    @Override
    public String name() {
        return "Вниз";
    }
}
