package ru.game.divvvan.character.monster.spawn;

import ru.game.divvvan.character.monster.Monster;
import ru.game.divvvan.character.monster.bestiaria.Ork;

public class OrkSpawner implements Spawner {

    @Override
    public Monster spawnMonster() {
        return new Ork();
    }
}
