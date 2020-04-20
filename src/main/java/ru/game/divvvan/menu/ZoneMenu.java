package ru.game.divvvan.menu;

import ru.game.divvvan.character.Person;
import ru.game.divvvan.utils.ConsoleUtils;
import ru.game.divvvan.Constants;
import ru.game.divvvan.command.Command;

import java.util.List;

public class ZoneMenu implements DefaultMenu {
    private List<Command> commandList = MenuFactory.moveMenu();

    public void show() {

        while (true) {
            Constants.WORLD_MAP.getCurrentZone().drawField();
            Person person = Constants.WORLD_MAP.getCurrentZone().getPerson();
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
