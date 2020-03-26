package gamefight.menu;

import gamefight.character.Person;
import gamefight.utils.ConsoleUtils;
import gamefight.zone.Zone;

import java.io.IOException;

public class StartMenu {
    private ShoppingMenu shopping = new ShoppingMenu();
    private Zone zone = new Zone();
    private ZoneMenu zoneMenu = new ZoneMenu();

    private void printMenu() {
        System.out.println("1 - Зайти в магазин");
        System.out.println("2 - Войти в зону");
        System.out.println("3 - Информация о персонаже");
        System.out.println("4 - Перейти поле");
        System.out.println("5 - Показать поле");
        System.out.println("0 - Завершить игру");
    }

    public void show(Person person) throws IOException {
        while (true) {
            printMenu();
            int numberMenu = ConsoleUtils.getIntFromConsole();
            switch (numberMenu) {
                case 1:
                    shopping.showMenu(person);
                    break;
                case 2:
                    zoneMenu.show(person);
// todo выбрать зону
                    break;
                case 3:
                    System.out.println(person);
                    break;
                case 4:
                    zone.initField();
                    break;
                case 5:
                    zone.drawField();
                    break;
                case 0:
                    return;
            }
        }
    }


//    private void fight(Person person, Person enemy) {
//        while (person.isAlive() && enemy.isAlive()) {
//            person.strike(enemy);
//            enemy.strike(person);
//            System.out.println(person.getName() + " " + person.getHp());
//            System.out.println(enemy.getName() + " " + enemy.getHp());
//        }
//    }


//    private void resetLocateAndCharacter(Person mixail) {
//        mixail.setHp(0);
//    }


}
