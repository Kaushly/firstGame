package gamefight.command;

import gamefight.character.Enemy;
import gamefight.character.Person;
import gamefight.field.Field;

public class Attacking implements Command {
//    private Field field = new Field();
    @Override
    public void execute(Person person) {

        fight(person, person.getCurrentEnemy());
        if (person.isAlive()) {
            System.out.println("Вы выжили с hp =  " + person.getHp());
        } else {
            System.out.println("Вы проиграли, возвращаетесь в город");
            resetLocateAndCharacter(person);
        }
    }

    private void resetLocateAndCharacter(Person mixail) {
        mixail.setHp(0);
    }

    public void fight(Person person, Enemy enemy) {
        while (person.isAlive() && enemy.isAlive()) {
            person.strike(enemy);
            enemy.strike(person);
            System.out.println(person.getName() + " " + person.getHp());
            System.out.println(enemy.getName() + " " + enemy.getHp());
        }
    }

    @Override
    public String name() {
        return "Атаковать";
    }
}

//
//  * * М * *   // ОД - 3 УД -1
//  * * * * *
//  * * * * *
//  * * * * *
//  * * * * *   // ОД - 3 УД -1
//  * * 0 * *
// 1
//  * * M * *   // ОД  - 3 УД - 1
//  * * * * *   // ОД - 0 УД - 1
//  * * * * *
//  * * * * *
//  * * * * 0
//  * * * * *
// 1-1
//  * * * * *   // ОД  - 0 УД - 1
//  * * * * *   // ОД - 0 УД - 1
//  * * * * *
//  * * M * *
//  * * * * 0
//  * * * * *
// 2
//  * * * * *   // ОД  - 3 УД - 1 50%
//  * * * * *   // ОД - 1 УД - 0 100%
//  * * * * *
//  * * M * *
//  * * 0 * *
//  * * * * *
// 3
//  * * * * *   // ОД  - 4 УД - 1
//  * * * * *   // ОД - 0 УД - 0
//  * * * * *
//  * * M * *
//  * * * * *
//  * * O * *


