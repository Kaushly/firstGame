package ru.game.divvvan.character.monster.spawn;

import ru.game.divvvan.character.monster.bestiaria.Gargoyle;
import ru.game.divvvan.character.monster.Monster;

public class GargoyleSpawner implements Spawner {

    @Override
    public Monster spawnMonster() {
        return new Gargoyle();
    }
}
