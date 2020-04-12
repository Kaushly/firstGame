package gamefight.character.monster.spawn;

import gamefight.character.monster.Monster;
import gamefight.character.monster.Ork;

public class OrkSpawner implements Spawner {

    @Override
    public Monster spawnMonster() {
        return new Ork();
    }
}
