package gamefight.menu;

import gamefight.character.Enemy;
import gamefight.character.Person;
import gamefight.utils.ConsoleUtils;
import gamefight.zone.Zone;

public class ActionZone {

    private Zone zone = new Zone();


    public void actionMenu() {
        System.out.println("1 - Информация о сопернике");
        System.out.println("2 - Информация о персонаже");
        System.out.println("3 - Напасть");
        System.out.println("0 - Пропустить бой и вернуться на карту");
    }
    public void battle(Person person, Enemy enemy){
        while (true){
            actionMenu();
            int numberMenu = ConsoleUtils.getIntFromConsole();
            switch (numberMenu){
                case 1:
                    System.out.println(enemy);
                    break;
                case 2:
                    System.out.println(person);
                    break;
                case 3:
                    Person currentEnemy = zone.getFirstEnemy();
                    fight(person, currentEnemy);
                    if (person.isAlive()) {
                        System.out.println("Вы выжили с hp =  " + person.getHp());
                        return;
                    } else {
                        System.out.println("Вы проиграли, возвращаетесь в город");
                        resetLocateAndCharacter(person);
                        return;
                    }
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
