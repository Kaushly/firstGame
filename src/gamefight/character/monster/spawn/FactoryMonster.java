package gamefight.character.monster.spawn;

import gamefight.character.monster.Demon;


import java.util.HashMap;
import java.util.Map;

public class FactoryMonster{
    private Map<Integer, Spawner> monsterFirstFloor = new HashMap<>();

    public FactoryMonster() {
        monsterFirstFloor.put(1, Demon::new);
    }
}
