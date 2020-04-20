package gamefight.character.monster.spawn;

import gamefight.character.monster.Monster;
import gamefight.character.monster.bestiaria.Mummy;

public class MummySpawner implements Spawner {

    @Override
    public Monster spawnMonster() {
        return new Mummy();
    }
}
