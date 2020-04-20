package gamefight.character.monster.spawn;

import gamefight.character.monster.bestiaria.Ghoul;
import gamefight.character.monster.Monster;

public class GhoulSpawner implements Spawner {

    @Override
    public Monster spawnMonster() {
        return new Ghoul();
    }
}
