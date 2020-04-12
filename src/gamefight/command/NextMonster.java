package gamefight.command;

import gamefight.character.Person;

public class NextMonster implements Command {
    @Override
    public void execute(Person person) {
        person.getTower().setCurrentEnemy(new Person("Grimli"));
        System.out.println(person.getTower().getCurrentEnemy());
    }

    @Override
    public String name() {
        return "Случайный монстр";
    }
}
