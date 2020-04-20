package ru.game.divvvan.character.monster.spawn;

import ru.game.divvvan.character.monster.Monster;
import ru.game.divvvan.character.monster.bestiaria.Mummy;

public class MummySpawner implements Spawner {

    @Override
    public Monster spawnMonster() {
        return new Mummy();
    }
}
