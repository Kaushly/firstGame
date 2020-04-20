package gamefight.character.monster.spawn;

import gamefight.character.monster.Monster;
import gamefight.character.monster.Zombi;

public class ZombiSpawner implements Spawner {

    @Override
    public Monster spawnMonster() {
        return new Zombi();
    }
}
