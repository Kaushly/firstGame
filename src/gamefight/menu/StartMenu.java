package gamefight.menu;

import gamefight.character.Person;
import gamefight.command.Command;
import gamefight.service.HealthyService;
import gamefight.utils.ConsoleUtils;

import java.util.List;

import static gamefight.Constants.WORLD_MAP;

public class StartMenu implements DefaultMenu {
    private List<Command> commandList = MenuFactory.startMenu();

    @Override
    public List<Command> getCommandList() {
        return commandList;
    }

    public void show(Person person) {
        WORLD_MAP.getCurrentZone().initField(person);
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
