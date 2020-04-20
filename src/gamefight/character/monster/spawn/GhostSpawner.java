package gamefight.character.monster.spawn;

import gamefight.character.monster.bestiaria.Ghost;
import gamefight.character.monster.Monster;

public class GhostSpawner implements Spawner {

    @Override
    public Monster spawnMonster() {
        return new Ghost();
    }
}
