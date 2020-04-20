package gamefight.character.monster.spawn;

import gamefight.character.monster.bestiaria.Doppelganger;
import gamefight.character.monster.Monster;

public class DoppelgangerSpawner implements Spawner {

    @Override
    public Monster spawnMonster() {
        return new Doppelganger();
    }
}
