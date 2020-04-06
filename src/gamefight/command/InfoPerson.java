package gamefight.command;

import gamefight.character.Person;

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
