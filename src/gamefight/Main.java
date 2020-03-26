package gamefight;

import gamefight.character.Enemy;
import gamefight.character.Person;
import gamefight.items.Accessories;
import gamefight.items.Armor;
import gamefight.items.Weapon;
import gamefight.zone.Zone;

import java.io.*;
//   ? ? ?
// ? * * * ?
// ? * * * ?
// ? * * * ?
//   & & &
// & - место появления персонажа
// * - пусто/монстр/сундук
// ? - выход на следующую зону

public class Main {

    public static void main(String[] args) throws IOException {
        GameConfiguration gameConfiguration = new GameConfiguration();
        Game game = new Game(gameConfiguration);
        game.start();
    }


}