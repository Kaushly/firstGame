package gamefight.character.monster.spawn;

import gamefight.character.monster.bestiaria.Boggard;
import gamefight.character.monster.Monster;

public class BoggardSpawner implements Spawner {

    @Override
    public Monster spawnMonster() {
        return new Boggard();
    }
}
