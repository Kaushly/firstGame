package ru.game.divvvan.character.monster.spawn;

import ru.game.divvvan.character.monster.Monster;
import ru.game.divvvan.character.monster.bestiaria.floor3.Zombi;

public class ZombiSpawner implements Spawner {

    @Override
    public Monster spawnMonster() {
        return new Zombi();
    }
}
