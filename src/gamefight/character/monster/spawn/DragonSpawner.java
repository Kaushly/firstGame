package gamefight.character.monster.spawn;

import gamefight.character.monster.bestiaria.Dragon;
import gamefight.character.monster.Monster;

public class DragonSpawner implements Spawner {

    @Override
    public Monster spawnMonster() {
        return new Dragon();
    }
}
