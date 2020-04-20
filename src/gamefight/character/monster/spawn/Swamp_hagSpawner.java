package gamefight.character.monster.spawn;

import gamefight.character.monster.Monster;
import gamefight.character.monster.bestiaria.Swamp_hag;

public class Swamp_hagSpawner implements Spawner {

    @Override
    public Monster spawnMonster() {
        return new Swamp_hag();
    }
}
