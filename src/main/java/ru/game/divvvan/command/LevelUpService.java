package ru.game.divvvan.command;

import ru.game.divvvan.character.Person;

import java.util.HashMap;
import java.util.Map;


public class LevelUpService {
    private Map<Integer, Integer> levels = new HashMap<>();

    public LevelUpService() {
        levels.put(1, 100);
        levels.put(2, 150);
        levels.put(3, 200);
        levels.put(4, 300);
        levels.put(5, 500);
        levels.put(6, 800);
        levels.put(7, 1000);
        levels.put(8, 1500);
        levels.put(9, 2100);
        levels.put(10, 3000);
    }

    public void nextLevel(Person person) {

        if (person.getExperience() > levels.get(person.getLevel())) {
            person.setExperience(person.getExperience() - levels.get(person.getLevel()));
            person.setAttack(person.getAttack() + (5 * person.getLevel()));
            person.setHp(person.getFullHp() + (10 * person.getLevel()));
            person.setFullHp(person.getHp());
            person.setDefense(person.getDefense() + (4 * person.getLevel()));
            person.setCoin(person.getCoin() + (10 * person.getLevel()));
            person.setLevel(person.getLevel() + 1);

            System.out.println("Уровень персонажа повышен до " + person.getLevel());
        }
    }

    public Integer getLevels(int level){
        return levels.get(level);
    }
}
