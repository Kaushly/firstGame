package gamefight.command;

import gamefight.character.Person;

public class InfoEnemy implements Command {
    @Override
    public void execute(Person person) {
        System.out.println(person.getCurrentEnemy());
    }

    @Override
    public String name() {
        return "Информация о противнике";
    }
}
