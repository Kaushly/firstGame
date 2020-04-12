package gamefight.command;

import gamefight.character.Drop;
import gamefight.character.Person;
import gamefight.service.FightService;

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
