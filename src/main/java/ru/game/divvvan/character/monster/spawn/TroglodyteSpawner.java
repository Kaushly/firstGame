package ru.game.divvvan.character.monster.spawn;

import ru.game.divvvan.character.monster.Monster;
import ru.game.divvvan.character.monster.bestiaria.Troglodyte;

public class TroglodyteSpawner implements Spawner {

    @Override
    public Monster spawnMonster() {
        return new Troglodyte();
    }
}
