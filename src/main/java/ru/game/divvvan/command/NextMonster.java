package ru.game.divvvan.command;

import ru.game.divvvan.character.Person;

public class NextMonster implements Command {

    @Override
    public void execute(Person person) {
        person.getTower().spawnRandomMonster();
        System.out.println(person.getTower().getCurrentMonster());
    }

    @Override
    public String name() {
        return "Случайный монстр";
    }
}
