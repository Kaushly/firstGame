package ru.game.divvvan.character.monster.spawn;

import ru.game.divvvan.character.monster.Monster;
import ru.game.divvvan.character.monster.bestiaria.Swamp_hag;

public class Swamp_hagSpawner implements Spawner {

    @Override
    public Monster spawnMonster() {
        return new Swamp_hag();
    }
}
