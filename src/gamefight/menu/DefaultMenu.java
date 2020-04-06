package gamefight.menu;

import gamefight.command.Command;
import gamefight.command.Exit;
import gamefight.command.NullCommand;

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
