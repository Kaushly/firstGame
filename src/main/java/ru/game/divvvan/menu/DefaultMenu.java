package ru.game.divvvan.menu;

import ru.game.divvvan.command.Command;
import ru.game.divvvan.command.Exit;
import ru.game.divvvan.command.NullCommand;

import java.util.List;

public interface DefaultMenu {
    Command EXIT = new Exit();
    Command NULL_COMMAND = new NullCommand();

    default void printMenu() {
        for (int i = 0; i < getCommandList().size(); i++) {
            System.out.println(i + " - " + getCommandList().get(i).name());
        }
        System.out.println("99 - Выход");
    }

    default Command getCommand(int numberMenu) {
        if (numberMenu >= 0 && getCommandList().size() > numberMenu) {
            return getCommandList().get(numberMenu);
        } else if (numberMenu == 99) {
            return EXIT;
        } else return NULL_COMMAND;
    }

    List<Command> getCommandList();
}
