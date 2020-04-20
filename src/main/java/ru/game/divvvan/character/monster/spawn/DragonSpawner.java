package ru.game.divvvan.character.monster.spawn;

import ru.game.divvvan.character.monster.bestiaria.Dragon;
import ru.game.divvvan.character.monster.Monster;

public class DragonSpawner implements Spawner {

    @Override
    public Monster spawnMonster() {
        return new Dragon();
    }
}
