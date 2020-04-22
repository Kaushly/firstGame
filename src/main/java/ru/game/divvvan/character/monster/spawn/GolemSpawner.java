package ru.game.divvvan.character.monster.spawn;

import ru.game.divvvan.character.monster.bestiaria.floor7.Golem;
import ru.game.divvvan.character.monster.Monster;

public class GolemSpawner implements Spawner {

    @Override
    public Monster spawnMonster() {
        return new Golem();
    }
}
