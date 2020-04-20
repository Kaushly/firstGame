package gamefight.character.monster.spawn;

import gamefight.character.monster.bestiaria.Goblin;
import gamefight.character.monster.Monster;

public class GoblinSpawner implements Spawner{
    @Override
    public Monster spawnMonster() {
        return new Goblin();
    }
}
