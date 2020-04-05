package gamefight.menu;

import gamefight.character.Person;
import gamefight.command.*;
import gamefight.field.WorldMap;
import gamefight.service.PersonWalkService;
import gamefight.utils.ConsoleUtils;

import static gamefight.Constants.WORLD_MAP;

public class ZoneMenu {
    private ShoppingMenu shopping = new ShoppingMenu();
    private Command moveDown = new MoveDown();
    private Command moveLeft = new MoveLeft();
    private Command moveRight = new MoveRight();
    private Command moveUp = new MoveUp();
    private Command nullCommand = new NullCommand();
    private Command exit = new Exit();

    private void printMenu() {
        System.out.println("1 - Вверх");
        System.out.println("2 - Влево");
        System.out.println("3 - Вправо");
        System.out.println("4 - Вниз");
        System.out.println("0 - Вернуться в город");
    }

    public void show() {

        while (true) {
            WORLD_MAP.getCurrentZone().drawField();
            Person person = WORLD_MAP.getCurrentZone().getPerson();
            printMenu();

            Command command = getCommand(ConsoleUtils.getIntFromConsole());
            if (command instanceof Exit) {
                return;
            }
            command.execute(person);
        }
    }

    private Command getCommand(int numberMenu) {
        switch (numberMenu) {
            case 1:
                return moveUp;
            case 2:
                return moveLeft;
            case 3:
                return moveRight;
            case 4:
                return moveDown;
            case 0:
                return exit;
            default:
                return nullCommand;
        }
    }
}
