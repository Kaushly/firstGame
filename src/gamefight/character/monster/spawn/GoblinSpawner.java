package gamefight.character.monster.spawn;

import gamefight.character.monster.Goblin;
import gamefight.character.monster.Monster;

public class GoblinSpawner implements Spawner{
    @Override
    public Monster spawnMonster() {
        return new Goblin();
    }
}
