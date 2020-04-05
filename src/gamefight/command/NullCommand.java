package gamefight.command;

import gamefight.character.Person;

public class NullCommand implements Command {
    @Override
    public void execute(Person person) {
        System.out.println("Такой команды нет");
    }
}
