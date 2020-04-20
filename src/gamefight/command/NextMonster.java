package gamefight.command;

import gamefight.character.Person;

public class NextMonster implements Command {

    @Override
    public void execute(Person person) {
        person.getTower().spawnRandomMonster();
        System.out.println(person.getTower().getCurrentMonster());
    }

    @Override
    public String name() {
        return "Случайный монстр";
    }
}
