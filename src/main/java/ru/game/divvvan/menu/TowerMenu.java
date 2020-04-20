package ru.game.divvvan.menu;

import ru.game.divvvan.character.Person;
import ru.game.divvvan.character.Tower;
import ru.game.divvvan.command.Command;
import ru.game.divvvan.utils.ConsoleUtils;
import ru.game.divvvan.Constants;

import java.util.List;

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
        Constants.WORLD_MAP.getCurrentZone().initField(person);
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
