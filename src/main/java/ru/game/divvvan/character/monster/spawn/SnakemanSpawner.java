package ru.game.divvvan.character.monster.spawn;

import ru.game.divvvan.character.monster.Monster;
import ru.game.divvvan.character.monster.bestiaria.floor3.Snakeman;

public class SnakemanSpawner implements Spawner {

    @Override
    public Monster spawnMonster() {
        return new Snakeman();
    }
}
