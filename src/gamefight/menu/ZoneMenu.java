package gamefight.menu;

import gamefight.field.WorldMap;
import gamefight.service.PersonWalkService;
import gamefight.utils.ConsoleUtils;

public class ZoneMenu {
    private ShoppingMenu shopping = new ShoppingMenu();
    private PersonWalkService personWalkService;

    private void printMenu() {
        System.out.println("1 - Вверх");
        System.out.println("2 - Влево");
        System.out.println("3 - Вправо");
        System.out.println("4 - Вниз");
        System.out.println("5 - Показать координаты");
        System.out.println("0 - Вернуться в город");
    }

    public void show(WorldMap worldMap) {
        personWalkService = new PersonWalkService( worldMap);
        while (true) {
            worldMap.getCurrentZone().drawField();
            printMenu();
            int numberMenu = ConsoleUtils.getIntFromConsole();
            switch (numberMenu) {
                case 1:
                    personWalkService.goUp();
                    break;
                case 2:
                    personWalkService.goLeft();
                    break;
                case 3:
                    personWalkService.goRight();
                    break;
                case 4:
                    personWalkService.goDown();
                    break;
                case 5:
                    System.out.println(worldMap.getCurrentZone().getPersonField().getCoordinate());
                    break;
                case 0:
                    return;
            }
        }
    }
}
