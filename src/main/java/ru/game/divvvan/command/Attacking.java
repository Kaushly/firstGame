package ru.game.divvvan.command;

import ru.game.divvvan.character.Enemy;
import ru.game.divvvan.character.Person;
import ru.game.divvvan.field.Coordinate;
import ru.game.divvvan.field.Field;
import ru.game.divvvan.menu.BattleMenu;

public class Attacking implements Command {
    private Field field = new Field(10, 10, 1);


    @Override
    public void execute(Person person) {
        Coordinate areaCoordinate = person.getCoordinate();
        Field oldField = person.getCurrentField();
        person.setCoordinate(new Coordinate(field.getWight() - 1, field.getHeight() / 2));
        this.field.initField(person);
        field.drawField();
        new BattleMenu().show(person, field);
        person.setCurrentField(oldField);
        person.setCoordinate(areaCoordinate);
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


