package gamefight.menu;

import gamefight.character.Enemy;
import gamefight.character.Person;
import gamefight.service.FightService;
import gamefight.utils.ConsoleUtils;

public class ActionZone {
    private FightService fightService = new FightService();

    public void actionMenu() {
        System.out.println("1 - Информация о сопернике");
        System.out.println("2 - Информация о персонаже");
        System.out.println("3 - Напасть");
        System.out.println("0 - Пропустить бой и вернуться на карту");
    }

    public void battle(Person person, Enemy enemy) {
        while (true) {
            actionMenu();
            int numberMenu = ConsoleUtils.getIntFromConsole();
            switch (numberMenu) {
                case 1:
                    System.out.println(enemy);
                    break;
                case 2:
                    System.out.println(person);
                    break;
                case 3:
                    fightService.fight(person, enemy);
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


    private void resetLocateAndCharacter(Person mixail) {
        mixail.setHp(0);
    }
}
