package gamefight.character.monster.spawn;

import gamefight.character.monster.Manticure;
import gamefight.character.monster.Monster;

public class ManticureSpawner implements Spawner {

    @Override
    public Monster spawnMonster() {
        return new Manticure();
    }
}