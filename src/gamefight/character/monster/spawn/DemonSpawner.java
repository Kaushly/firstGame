package gamefight.character.monster.spawn;

import gamefight.character.monster.bestiaria.Demon;
import gamefight.character.monster.Monster;

public class DemonSpawner implements Spawner {

    @Override
    public Monster spawnMonster() {
        return new Demon();
    }
}
