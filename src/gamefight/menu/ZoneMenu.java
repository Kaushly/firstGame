package gamefight.menu;

import gamefight.character.Person;
import gamefight.command.*;
import gamefight.utils.ConsoleUtils;

import java.util.List;

import static gamefight.Constants.WORLD_MAP;

public class ZoneMenu implements DefaultMenu {
    private List<Command> commandList = MenuFactory.zoneMenu();
    private ShoppingMenu shopping = new ShoppingMenu();

    public void show() {

        while (true) {
            WORLD_MAP.getCurrentZone().drawField();
            Person person = WORLD_MAP.getCurrentZone().getPerson();
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
