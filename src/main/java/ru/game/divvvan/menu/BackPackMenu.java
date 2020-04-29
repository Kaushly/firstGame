package ru.game.divvvan.menu;

import ru.game.divvvan.character.Person;
import ru.game.divvvan.command.Command;
import ru.game.divvvan.items.RealItem;
import ru.game.divvvan.utils.ConsoleUtils;

import java.util.List;

public class BackPackMenu implements DefaultMenu {
    private List<Command> commandList = MenuFactory.PackMenu();

    public void packMenu(Person person) {
        int number = 1;
        if(person.getBackPack().getItemsList().size() == 0){
            System.out.println();
            System.out.println("Рюкзак пуст");
            System.out.println();
        }else {
            while (true) {
                printMenu();
                Command command = getCommand(ConsoleUtils.getIntFromConsole());
                if (command == EXIT) {
                    return;
                }
                command.execute(person);
            }
        }

    }
    @Override
    public List<Command> getCommandList() {
        return commandList;
    }
}
