package ru.game.divvvan.character.monster.spawn;

import ru.game.divvvan.character.monster.Monster;
import ru.game.divvvan.character.monster.bestiaria.floor7.Ogr;

public class OgrSpawner implements Spawner {

    @Override
    public Monster spawnMonster() {
        return new Ogr();
    }
}
