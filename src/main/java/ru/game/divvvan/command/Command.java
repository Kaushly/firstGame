package ru.game.divvvan.command;

import ru.game.divvvan.character.Person;

public interface Command {
    void execute(Person person);
    String name();
}
