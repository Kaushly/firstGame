package ru.game.divvvan.command;

import ru.game.divvvan.character.Person;

public class Jump implements Command {
    @Override
    public void execute(Person person) {
        System.out.println("Прыгнул со скалы");
    }

    @Override
    public String name() {
        return "Прыжок";
    }
}
