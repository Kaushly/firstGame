package ru.game.divvvan.command;

import ru.game.divvvan.character.Person;

public class Experince implements Command{
    @Override
    public void execute(Person person) {
        System.out.println("Опыта заработанно: " + person.getExperience());
    }

    @Override
    public String name() {
        return "Опыт";
    }
}
