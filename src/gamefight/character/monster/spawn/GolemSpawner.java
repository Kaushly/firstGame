package gamefight.character.monster.spawn;

import gamefight.character.monster.bestiaria.Golem;
import gamefight.character.monster.Monster;

public class GolemSpawner implements Spawner {

    @Override
    public Monster spawnMonster() {
        return new Golem();
    }
}
