package gamefight.character.monster.spawn;

import gamefight.character.monster.Monster;
import gamefight.character.monster.Ogr;

public class OgrSpawner implements Spawner {

    @Override
    public Monster spawnMonster() {
        return new Ogr();
    }
}
