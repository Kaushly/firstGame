package gamefight.character.monster.spawn;

import gamefight.character.monster.Monster;
import gamefight.character.monster.bestiaria.Wolf;

public class WolfSpawner implements Spawner {

    @Override
    public Monster spawnMonster() {
        return new Wolf();
    }
}
