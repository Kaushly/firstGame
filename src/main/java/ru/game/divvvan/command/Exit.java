package ru.game.divvvan.command;

import ru.game.divvvan.character.Person;

public class Exit implements Command {
    @Override
    public void execute(Person person) {
        System.out.println("Вы ушли");

    }

    @Override
    public String name() {
        return "Выход";
    }
}
