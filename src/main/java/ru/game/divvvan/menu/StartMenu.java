package ru.game.divvvan.menu;

import ru.game.divvvan.character.Person;
import ru.game.divvvan.command.Command;
import ru.game.divvvan.service.HealthyService;
import ru.game.divvvan.utils.ConsoleUtils;
import ru.game.divvvan.Constants;

import java.util.List;

public class StartMenu implements DefaultMenu {
    private List<Command> commandList = MenuFactory.startMenu();

    @Override
    public List<Command> getCommandList() {
        return commandList;
    }

    public void show(Person person) {
        Constants.WORLD_MAP.getCurrentZone().initField(person);
        HealthyService healhyService = new HealthyService(person);
        while (true) {
            printMenu();

            Command command = getCommand(ConsoleUtils.getIntFromConsole());
            if (command == EXIT) {
                return;
            }
            command.execute(person);
            if (!person.isAlive()) {
                healhyService.recovery();
            }
        }
    }
}
