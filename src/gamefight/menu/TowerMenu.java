package gamefight.menu;

import gamefight.character.Person;
import gamefight.character.Tower;
import gamefight.command.Command;
import gamefight.utils.ConsoleUtils;

import java.util.List;

import static gamefight.Constants.WORLD_MAP;

public class TowerMenu implements DefaultMenu {
    private List<Command> commandList = MenuFactory.towerMenu();

    @Override
    public List<Command> getCommandList() {
        return commandList;
    }

    public void show(Person person) {
        if (person.getTower() == null) {
            person.setTower(new Tower());
        }
        WORLD_MAP.getCurrentZone().initField(person);
        while (true) {
            printMenu();

            Command command = getCommand(ConsoleUtils.getIntFromConsole());
            if (command == EXIT) {
                return;
            }
            command.execute(person);
            if (!person.isAlive()) {
                System.out.println("Вы умерли и возвращаетесь в замок");
                return;
            }
        }
    }
}
