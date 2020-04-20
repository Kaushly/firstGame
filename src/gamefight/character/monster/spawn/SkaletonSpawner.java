package gamefight.character.monster.spawn;

import gamefight.character.monster.Monster;
import gamefight.character.monster.bestiaria.Skeleton;

public class SkaletonSpawner implements Spawner {

    @Override
    public Monster spawnMonster() {
        return new Skeleton();
    }
}
