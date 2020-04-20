package ru.game.divvvan.command;

import ru.game.divvvan.character.Person;

public class Hit implements Command{
    @Override
    public void execute(Person person) {
        System.out.println("Ударили");
    }

    @Override
    public String name() {
        return "Ударить";
    }
}
