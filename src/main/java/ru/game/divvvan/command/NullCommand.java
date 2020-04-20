package ru.game.divvvan.command;

import ru.game.divvvan.character.Person;

public class NullCommand implements Command {
    @Override
    public void execute(Person person) {
        System.out.println("Такой команды нет");
    }

    @Override
    public String name() {
        return "Попробуйте еще";
    }
}
