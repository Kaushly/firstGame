package gamefight.command;

import gamefight.character.Person;

public class Experince implements Command{
    @Override
    public void execute(Person person) {
        System.out.println("Опыта заработанно: " + person.getXp());
    }

    @Override
    public String name() {
        return "Опыт";
    }
}