package gamefight.command;

import gamefight.character.Person;

public interface Command {
    void execute(Person person);
    String name();
}
