package ru.game.divvvan.character;

import ru.game.divvvan.character.monster.Monster;
import ru.game.divvvan.character.monster.spawn.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Tower {
    private int floor;
    private int maxFloor = 99;
    private Monster currentMonster;

    private HashMap<Integer, List<Spawner>> currentSpawner = new HashMap<>();

    public Tower() {
        this.floor = 1;
        currentSpawner.put(1, Arrays.asList(new DemonSpawner(), new OrkSpawner()));
        currentSpawner.put(2, Arrays.asList(new SalamandraSpawner(), new OgrSpawner()));
        currentSpawner.put(3, Arrays.asList(new SnakemanSpawner(), new WolfSpawner()));
    }

    public int getFloor() {
        return floor;
    }

    public void upLevel() {
        floor++;
    }

    public List<Spawner> getCurrentSpawner() {
        return currentSpawner.get(floor);
    }

    public Monster getCurrentMonster() {
        return currentMonster;
    }

    public void setCurrentMonster(Monster currentMonster) {
        this.currentMonster = currentMonster;
    }

    public void spawnRandomMonster() {
        if (getCurrentSpawner() != null) {
            currentMonster = getCurrentSpawner().get(((int) (Math.random() * getCurrentSpawner().size()))).spawnMonster();
        }
    }
}
