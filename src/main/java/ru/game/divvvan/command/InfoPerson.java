package ru.game.divvvan.command;

import ru.game.divvvan.character.Person;

public class InfoPerson implements Command {

    @Override
    public void execute(Person person) {

        System.out.println(person);
    }

    @Override
    public String name() {
        return "Информация о персонаже";
    }
}
