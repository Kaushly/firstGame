package gamefight.character.monster.spawn;

import gamefight.character.monster.bestiaria.Barghest;
import gamefight.character.monster.Monster;

public class BarghestSpawner implements Spawner{

    @Override
    public Monster spawnMonster() {
        return new Barghest();
    }
}
