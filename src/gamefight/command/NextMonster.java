package gamefight.command;

import gamefight.character.Person;
import gamefight.character.monster.spawn.*;

import java.util.Arrays;

public class NextMonster implements Command {
    private FactorySpawner factorySpawner = new FactorySpawner();

    @Override
    public void execute(Person person) {
        person.getTower().setCurrentMonster(factorySpawner.spawnRandomMonster());
        System.out.println(person.getTower().getCurrentMonster());
    }

    @Override
    public String name() {
        return "Случайный монстр";
    }
}
