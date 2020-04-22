package ru.game.divvvan.character.monster.spawn;

import ru.game.divvvan.character.monster.Monster;
import ru.game.divvvan.character.monster.bestiaria.floor5.Salamandra;

public class SalamandraSpawner implements Spawner {

    @Override
    public Monster spawnMonster() {
        return new Salamandra();
    }
}
