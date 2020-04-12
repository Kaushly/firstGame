package gamefight.service;

import gamefight.character.Drop;
import gamefight.character.Enemy;
import gamefight.character.Person;

public class FightService {

    public void fight(Person person, Enemy enemy) {
        while (person.isAlive() && enemy.isAlive()) {
            person.strike(enemy);
            enemy.strike(person);
            System.out.println(person.getName() + " " + person.getHp());
            System.out.println(enemy.getName() + " " + enemy.getHp());
        }
    }

    public Drop fight(Person person, Person enemy) {
        while (person.isAlive() && enemy.isAlive()) {
            try {
                person.strike(enemy);
                Thread.sleep(200);
                enemy.strike(person);
                Thread.sleep(500);

            } catch (InterruptedException e) {
                e.printStackTrace();

            }
            System.out.println(person.getName() + " " + person.getHp());
            System.out.println(enemy.getName() + " " + enemy.getHp());

        }
        return new Drop((long) (Math.random() * 10));
    }
}
