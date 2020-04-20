package gamefight.character.monster.spawn;

import gamefight.character.monster.Monster;

import java.util.Arrays;
import java.util.List;

public class FactorySpawner {
    private List<Spawner> spawners;

    public FactorySpawner() {
        this.spawners = Arrays.asList(
                new DemonSpawner(),
                new GhostSpawner(),
                new OrkSpawner(),
                new GoblinSpawner()
        );
    }

    public Monster spawnRandomMonster() {
        if (spawners != null) {
            return spawners.get(((int) (Math.random() * spawners.size()))).spawnMonster();
        }
        return null;
    }
}
