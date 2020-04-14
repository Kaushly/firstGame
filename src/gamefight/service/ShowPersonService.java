package gamefight.service;

import gamefight.character.Person;
import gamefight.command.Command;
import gamefight.command.LevelUpService;

public class ShowPersonService {
    private LevelUpService levelUpService = new LevelUpService();

    public void execute(Person person) {

        System.out.println(person.getName() +
                ", hp=(" + person.getHp() + "/" + person.getFullHp() +
                "), attack=" + person.getAttack() +
                ", уровень: " + person.getLevel() +
                ", опыт: " + person.getExperience() + "/" + levelUpService.getLevels(person.getLevel())
        );
    }
}
