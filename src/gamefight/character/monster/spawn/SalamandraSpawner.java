package gamefight.character.monster.spawn;

import gamefight.character.monster.Monster;
import gamefight.character.monster.bestiaria.Salamandra;

public class SalamandraSpawner implements Spawner {

    @Override
    public Monster spawnMonster() {
        return new Salamandra();
    }
}
