package ru.game.divvvan.character.monster.spawn;

import ru.game.divvvan.character.monster.bestiaria.floor1.Goblin;
import ru.game.divvvan.character.monster.Monster;

public class GoblinSpawner implements Spawner{
    @Override
    public Monster spawnMonster() {
        return new Goblin();
    }
}
