package gamefight.character.monster.spawn;

import gamefight.character.monster.Ghost;
import gamefight.character.monster.Monster;
import gamefight.character.monster.Ork;

public class GhostSpawner implements Spawner {

    @Override
    public Monster spawnMonster() {
        return new Ghost();
    }
}
