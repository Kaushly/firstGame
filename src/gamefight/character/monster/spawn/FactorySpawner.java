package gamefight.character.monster.spawn;

import gamefight.character.monster.Monster;

import java.util.List;

public class FactorySpawner {
    private List<Spawner> spawners;

    public FactorySpawner(List<Spawner> spawners) {
        this.spawners = spawners;
    }

    public Monster spawnRandomMonster() {
        if (spawners != null) {
            return spawners.get(((int) (Math.random() * spawners.size()))).spawnMonster();
        }
        return null;
    }
}
