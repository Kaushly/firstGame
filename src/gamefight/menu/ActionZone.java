package gamefight.menu;

import gamefight.character.Person;
import gamefight.command.Command;
import gamefight.service.FightService;
import gamefight.utils.ConsoleUtils;

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
            command.execute(person);
        }
    }

    @Override
    public List<Command> getCommandList() {
        return commandList;
    }
}
