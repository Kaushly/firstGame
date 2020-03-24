package gamefight.menu;

import gamefight.character.Person;
import gamefight.utils.ConsoleUtils;
import gamefight.zone.Zone;

import java.io.IOException;

public class StartMenu {
    private ShoppingMenu shopping = new ShoppingMenu();
    private Zone zone = new Zone();

    public void show(Person person) throws IOException {
        while (true) {
            printMenu();
            int numberMenu = ConsoleUtils.getIntFromConsole();
            switch (numberMenu) {
                case 1:
                    shopping.showMenu(person);
                    break;
                case 2:
                    Person currentEnemy = zone.getFirstEnemy();
                    fight(person, currentEnemy);
                    if (person.isAlive()) {
                        System.out.println("Вы выжили с hp =  " + person.getHp());
                        break;
                    } else {
                        System.out.println("Вы проиграли, возвращаетесь в город");
                        resetLocateAndCharacter(person);
                    }
//                    System.out.println("выберете зону");//todo выбрать зону
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

    private void printMenu() {
        System.out.println("1 - Зайти в магазин");
        System.out.println("2 - Атаковать монстра");
        System.out.println("3 - Информация о персонаже");
        System.out.println("4 - Перейти поле");
        System.out.println("5 - Показать поле");
        System.out.println("0 - Завершить игру");
    }

    private void fight(Person maxail, Person enemy) {
        while (maxail.isAlive() && enemy.isAlive()) {
            maxail.strike(enemy);
            enemy.strike(maxail);
            System.out.println(maxail.getName() + " " + maxail.getHp());
            System.out.println(enemy.getName() + " " + enemy.getHp());
        }
    }


    private void resetLocateAndCharacter(Person mixail) {
        mixail.setHp(0);
    }


}
