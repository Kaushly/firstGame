package ru.game.divvvan.character.monster.spawn;

import ru.game.divvvan.character.monster.bestiaria.floor9.Demon;
import ru.game.divvvan.character.monster.Monster;

public class DemonSpawner implements Spawner {

    @Override
    public Monster spawnMonster() {
        return new Demon();
    }
}
