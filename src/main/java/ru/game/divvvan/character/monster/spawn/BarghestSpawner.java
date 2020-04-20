package ru.game.divvvan.character.monster.spawn;

import ru.game.divvvan.character.monster.bestiaria.Barghest;
import ru.game.divvvan.character.monster.Monster;

public class BarghestSpawner implements Spawner{

    @Override
    public Monster spawnMonster() {
        return new Barghest();
    }
}
