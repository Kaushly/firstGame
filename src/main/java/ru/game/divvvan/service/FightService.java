package ru.game.divvvan.service;

import ru.game.divvvan.character.Drop;
import ru.game.divvvan.character.Enemy;
import ru.game.divvvan.character.Person;
import ru.game.divvvan.character.monster.Monster;

public class FightService {

    public void fight(Person person, Enemy enemy) {
        while (person.isAlive() && enemy.isAlive()) {
            person.strike(enemy);
            enemy.strike(person);
            System.out.println(person.getName() + " " + person.getHp());
            System.out.println(enemy.getName() + " " + enemy.getHp());
        }
    }

    public Drop fight(Person person, Monster monster) {
        while (person.isAlive() && monster.isAlive()) {
            try {
                person.strike(monster);
                Thread.sleep(200);
                monster.strike(person);
                Thread.sleep(500);

            } catch (InterruptedException e) {
                e.printStackTrace();

            }
            System.out.println(person.getName() + " " + person.getHp());
            System.out.println(monster.getTypeMonster() + " " + monster.getHp());

        }
        return new Drop(1 + (long) (Math.random() * 10), monster.getExp());
    }
}
