package ru.game.divvvan.character.monster.spawn;

import ru.game.divvvan.character.monster.bestiaria.floor8.Ghoul;
import ru.game.divvvan.character.monster.Monster;

public class GhoulSpawner implements Spawner {

    @Override
    public Monster spawnMonster() {
        return new Ghoul();
    }
}
