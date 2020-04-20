package gamefight.character.monster.spawn;

import gamefight.character.monster.Monster;
import gamefight.character.monster.Troglodyte;

public class TroglodyteSpawner implements Spawner {

    @Override
    public Monster spawnMonster() {
        return new Troglodyte();
    }
}
