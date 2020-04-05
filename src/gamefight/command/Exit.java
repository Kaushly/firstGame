package gamefight.command;

import gamefight.character.Person;

public class Exit implements Command {
    @Override
    public void execute(Person person) {
        System.out.println("Вы ушли");

    }
}
