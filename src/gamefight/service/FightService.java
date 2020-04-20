package gamefight.service;

import gamefight.character.Drop;
import gamefight.character.Enemy;
import gamefight.character.Person;
import gamefight.character.monster.Monster;

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
        return new Drop((long) (Math.random() * 10), monster.getExp());
    }
}
