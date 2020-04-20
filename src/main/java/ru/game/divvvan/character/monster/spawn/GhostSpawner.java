package ru.game.divvvan.character.monster.spawn;

import ru.game.divvvan.character.monster.bestiaria.Ghost;
import ru.game.divvvan.character.monster.Monster;

public class GhostSpawner implements Spawner {

    @Override
    public Monster spawnMonster() {
        return new Ghost();
    }
}
