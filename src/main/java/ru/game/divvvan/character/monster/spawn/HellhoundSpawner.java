package ru.game.divvvan.character.monster.spawn;

import ru.game.divvvan.character.monster.bestiaria.Hellhound;
import ru.game.divvvan.character.monster.Monster;

public class HellhoundSpawner  implements Spawner{

    @Override
    public Monster spawnMonster() {
        return new Hellhound();
    }
}
