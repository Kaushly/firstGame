package ru.game.divvvan.character.monster.spawn;

import ru.game.divvvan.character.monster.Monster;
import ru.game.divvvan.character.monster.bestiaria.floor2.Skeleton;

public class SkaletonSpawner implements Spawner {

    @Override
    public Monster spawnMonster() {
        return new Skeleton();
    }
}
