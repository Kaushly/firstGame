package ru.game.divvvan.command.move;

import ru.game.divvvan.character.Person;
import ru.game.divvvan.command.Command;
import ru.game.divvvan.field.Coordinate;
import ru.game.divvvan.service.PersonWalkService;

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
