package ru.game.divvvan.character.monster.spawn;

import ru.game.divvvan.character.monster.bestiaria.floor6.Boggard;
import ru.game.divvvan.character.monster.Monster;

public class BoggardSpawner implements Spawner {

    @Override
    public Monster spawnMonster() {
        return new Boggard();
    }
}
