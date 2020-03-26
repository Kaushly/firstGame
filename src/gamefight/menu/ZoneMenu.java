package gamefight.menu;

import gamefight.character.Enemy;
import gamefight.character.Person;
import gamefight.field.Coordinate;
import gamefight.field.Field;
import gamefight.utils.ConsoleUtils;
import gamefight.zone.Zone;

import java.io.IOException;

public class ZoneMenu {
    private ShoppingMenu shopping = new ShoppingMenu();
    private Zone zone = new Zone();

    private void printMenu() {
        System.out.println("1 - Вверх");
        System.out.println("2 - Влево");
        System.out.println("3 - Вправо");
        System.out.println("4 - Вниз");
        System.out.println("5 - Показать координаты");
        System.out.println("6 - Напасть на монстра");
        System.out.println("0 - Вернуться в город");
    }

    public void show(Person person) {
        zone.initField();
        Coordinate coordinate = new Coordinate();
        person.setCoordinate(coordinate);
        while (true) {
            zone.drawField();
            printMenu();
            Field field = zone.getField();
            int numberMenu = ConsoleUtils.getIntFromConsole();
            switch (numberMenu) {
                case 1:
                    coordinate.up();
                    field.go(coordinate);
                    break;
                case 2:
                    coordinate.left();
                    field.go(coordinate);
                    break;
                case 3:
                    coordinate.right();
                    field.go(coordinate);
                    break;
                case 4:
                    coordinate.down();
                    field.go(coordinate);
                    break;
                case 5:
                    System.out.println(coordinate);
                    break;
                case 6:
                    Person currentEnemy = zone.getFirstEnemy();
                    fight(person, currentEnemy);
                    if (person.isAlive()) {
                        System.out.println("Вы выжили с hp =  " + person.getHp());
                    } else {
                        System.out.println("Вы проиграли, возвращаетесь в город");
                        resetLocateAndCharacter(person);
                    }
                    break;
                case 0:
                    return;
            }
        }
    }
    private void fight(Person person, Person enemy) {
        while (person.isAlive() && enemy.isAlive()) {
            person.strike(enemy);
            enemy.strike(person);
            System.out.println(person.getName() + " " + person.getHp());
            System.out.println(enemy.getName() + " " + enemy.getHp());
        }
    }
    private void resetLocateAndCharacter(Person mixail) {
        mixail.setHp(0);
    }
}
