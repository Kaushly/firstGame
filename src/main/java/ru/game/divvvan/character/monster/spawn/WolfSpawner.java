package ru.game.divvvan.character.monster.spawn;

import ru.game.divvvan.character.monster.Monster;
import ru.game.divvvan.character.monster.bestiaria.Wolf;

public class WolfSpawner implements Spawner {

    @Override
    public Monster spawnMonster() {
        return new Wolf();
    }
}
