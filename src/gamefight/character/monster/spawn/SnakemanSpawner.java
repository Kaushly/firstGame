package gamefight.character.monster.spawn;

import gamefight.character.monster.Monster;
import gamefight.character.monster.bestiaria.Snakeman;

public class SnakemanSpawner implements Spawner {

    @Override
    public Monster spawnMonster() {
        return new Snakeman();
    }
}
