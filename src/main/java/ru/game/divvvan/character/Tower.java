package ru.game.divvvan.character;

import lombok.Data;
import ru.game.divvvan.character.monster.Monster;
import ru.game.divvvan.character.monster.spawn.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@Data
public class Tower {
    private int floor;
    private int maxFloor = 99;
    private Monster currentMonster;
    private int killMonster = 0;

    private HashMap<Integer, List<Spawner>> currentSpawner = new HashMap<>();

    public Tower() {
        this.floor = 1;
        currentSpawner.put(1, Arrays.asList(new GoblinSpawner(), new TroglodyteSpawner(), new SkaletonSpawner()));
        currentSpawner.put(2, Arrays.asList(new GhostSpawner(), new SkaletonSpawner(), new WolfSpawner(),
                new SnakemanSpawner()));
        currentSpawner.put(3, Arrays.asList(new OrkSpawner(), new SnakemanSpawner(), new ZombiSpawner(),
                new WarewolfSpawner()));
        currentSpawner.put(4, Arrays.asList(new GargoyleSpawner(), new MummySpawner(), new WarewolfSpawner(),
                new SalamandraSpawner()));
        currentSpawner.put(5, Arrays.asList(new SalamandraSpawner(), new BarghestSpawner(),
                new SalamandraSpawner(), new BarghestSpawner(), new Swamp_hagSpawner()));
        currentSpawner.put(6, Arrays.asList(new BoggardSpawner(), new Swamp_hagSpawner(),
                new BoggardSpawner(), new Swamp_hagSpawner(), new GolemSpawner()));
        currentSpawner.put(7, Arrays.asList(new GolemSpawner(), new OgrSpawner(),
                new GolemSpawner(), new OgrSpawner(), new ManticureSpawner() ));
        currentSpawner.put(8, Arrays.asList(new GhoulSpawner(), new ManticureSpawner(), new ManticureSpawner(),
                new HellhoundSpawner()));
        currentSpawner.put(9, Arrays.asList(new DemonSpawner(), new DoppelgangerSpawner(), new HellhoundSpawner(),
                new DemonSpawner(), new HellhoundSpawner()));
        currentSpawner.put(10, Arrays.asList(new DragonSpawner()));
    }

    public int getFloor() {
        return floor;
    }

    public void upFloor() {
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
