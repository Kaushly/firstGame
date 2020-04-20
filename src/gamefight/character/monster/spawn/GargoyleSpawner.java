package gamefight.character.monster.spawn;

import gamefight.character.monster.Gargoyle;
import gamefight.character.monster.Monster;

public class GargoyleSpawner implements Spawner {

    @Override
    public Monster spawnMonster() {
        return new Gargoyle();
    }
}
