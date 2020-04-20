package gamefight.character.monster.spawn;

import gamefight.character.monster.Monster;
import gamefight.character.monster.Warewolf;

public class WarewolfSpawner implements Spawner {

    @Override
    public Monster spawnMonster() {
        return new Warewolf();
    }
}
