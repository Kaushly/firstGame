package ru.game.divvvan.character.monster.spawn;

import ru.game.divvvan.character.monster.Monster;
import ru.game.divvvan.character.monster.bestiaria.floor4.Mummy;

public class MummySpawner implements Spawner {

    @Override
    public Monster spawnMonster() {
        return new Mummy();
    }
}
