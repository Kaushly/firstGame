package ru.game.divvvan.menu;

import ru.game.divvvan.character.Person;
import ru.game.divvvan.command.Attacking;
import ru.game.divvvan.command.Command;
import ru.game.divvvan.utils.ConsoleUtils;

import java.util.List;

public class ActionZone implements DefaultMenu {
    private List<Command> commandList = MenuFactory.actionMenu();

    public void battle(Person person) {
        while (true) {
            printMenu();
            Command command = getCommand(ConsoleUtils.getIntFromConsole());
            if (command == EXIT) {
                return;
            }
            if (command instanceof Attacking) {
                command.execute(person);
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
