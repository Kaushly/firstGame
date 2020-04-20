package ru.game.divvvan.command;

import ru.game.divvvan.character.Person;

public class AmounCoin implements Command {


    @Override
    public void execute(Person person) {
        System.out.println("В кармане нашлось " + person.getCoin() + " монет.");
    }

    @Override
    public String name() {
        return "Монеты";
    }
}
