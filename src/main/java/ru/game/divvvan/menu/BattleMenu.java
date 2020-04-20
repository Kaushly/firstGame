package ru.game.divvvan.menu;

import ru.game.divvvan.character.Person;
import ru.game.divvvan.command.Command;
import ru.game.divvvan.command.Hit;
import ru.game.divvvan.field.Field;
import ru.game.divvvan.service.FieldService;
import ru.game.divvvan.utils.ConsoleUtils;

import java.util.List;

public class BattleMenu implements DefaultMenu {
    private List<Command> commandList = MenuFactory.moveMenu();
    private FieldService fieldService = new FieldService();

    public void show(Person person, Field field) {

        while (true) {
            if (fieldService.isCloseEnemy(person)) {
                commandList.add(new Hit());
            } else {
                commandList.removeIf(p -> p instanceof Hit);
            }

            field.drawField();
            printMenu();


            Command command = getCommand(ConsoleUtils.getIntFromConsole());
            if (command == EXIT) {
                return;
            }
            command.execute(person);

        }
    }

    @Override
    public List<Command> getCommandList() {
        return commandList;
    }
}
