package gamefight.character.monster.spawn;

import gamefight.character.monster.Hellhound;
import gamefight.character.monster.Monster;

public class HellhoundSpawner  implements Spawner{

    @Override
    public Monster spawnMonster() {
        return new Hellhound();
    }
}
