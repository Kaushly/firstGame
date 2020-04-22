package ru.game.divvvan.character.monster.spawn;

import ru.game.divvvan.character.monster.bestiaria.floor9.Hellhound;
import ru.game.divvvan.character.monster.Monster;

public class HellhoundSpawner  implements Spawner{

    @Override
    public Monster spawnMonster() {
        return new Hellhound();
    }
}
