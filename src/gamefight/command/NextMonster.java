package gamefight.command;

import gamefight.character.Person;
import gamefight.character.monster.spawn.DemonSpawner;
import gamefight.character.monster.spawn.FactorySpawner;
import gamefight.character.monster.spawn.GhostSpawner;
import gamefight.character.monster.spawn.OrkSpawner;

import java.util.Arrays;

public class NextMonster implements Command {
    private FactorySpawner factorySpawner = new FactorySpawner(Arrays.asList(new DemonSpawner(), new GhostSpawner(), new OrkSpawner()));

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
