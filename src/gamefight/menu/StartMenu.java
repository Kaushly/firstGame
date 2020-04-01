package gamefight.menu;

import gamefight.character.Person;
import gamefight.field.WorldMap;
import gamefight.utils.ConsoleUtils;

import java.io.IOException;

public class StartMenu {
    private ShoppingMenu shopping = new ShoppingMenu();
    private ZoneMenu zoneMenu = new ZoneMenu();
    private WorldMap worldMap = new WorldMap(3);

    private void printMenu() {
        System.out.println("1 - Зайти в магазин");
        System.out.println("2 - Войти в зону");
        System.out.println("3 - Информация о персонаже");
        System.out.println("0 - Завершить игру");
    }

    public void show(Person person) throws IOException {
        worldMap.getCurrentZone().initField(person);
        while (true) {
            printMenu();
            int numberMenu = ConsoleUtils.getIntFromConsole();
            switch (numberMenu) {
                case 1:
                    shopping.showMenu(person);
                    break;
                case 2:
                    zoneMenu.show(worldMap);
// todo выбрать зону
                    break;
                case 3:
                    System.out.println(person);
                    break;
                case 0:
                    return;
            }
        }
    }

}
