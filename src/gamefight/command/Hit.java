package gamefight.command;

import gamefight.character.Person;

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
