package gamefight.menu;

import gamefight.character.Person;
import gamefight.command.Command;
import gamefight.command.Hit;
import gamefight.field.Field;
import gamefight.utils.ConsoleUtils;

import java.util.List;

import static gamefight.Constants.WORLD_MAP;

public class BattleMenu implements DefaultMenu {
    private List<Command> commandList = MenuFactory.moveMenu();

    public void show(Person person, Field field) {

        while (true) {
            if (field.isCloseEnemy(person)) {
                commandList.add(new Hit());
            } else {
                commandList.removeIf(p -> p instanceof Hit);
            }

            field.drawField();
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
