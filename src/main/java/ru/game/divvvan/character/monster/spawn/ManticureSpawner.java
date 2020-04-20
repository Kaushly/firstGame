package ru.game.divvvan.character.monster.spawn;

import ru.game.divvvan.character.monster.bestiaria.Manticure;
import ru.game.divvvan.character.monster.Monster;

public class ManticureSpawner implements Spawner {

    @Override
    public Monster spawnMonster() {
        return new Manticure();
    }
}
