package ru.game.divvvan.field;

import ru.game.divvvan.zone.Zone;

public class WorldMap {
    private Zone[][] zones;
    private int size;
    private Zone currentZone;

    public WorldMap(int size) {
        this.zones = new Zone[size][size];
        this.size = size;
        init();
        currentZone = zones[size / 2][size / 2];
    }

    private void init() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                zones[i][j] = new Zone(new Coordinate(i, j));
            }
        }
    }

    public Zone getCurrentZone() {
        return currentZone;
    }
}
