package ru.game.divvvan.character.monster.spawn;

import ru.game.divvvan.character.monster.bestiaria.floor9.Doppelganger;
import ru.game.divvvan.character.monster.Monster;

public class DoppelgangerSpawner implements Spawner {

    @Override
    public Monster spawnMonster() {
        return new Doppelganger();
    }
}
