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


//todo добавить  ограничение на взятие оружя у врага
/// TODO: 04.02.2020  добавить инвентарь в персонажа, куда можно положить вещи
//todo добавить во врага вещи, которые могут из него падать
// TODO: 04.02.2020 персонаж атакует врага и оба получают урон
//todo разгные враги создать
public class Main {

    public static void main(String[] args) throws IOException {
        GameConfiguration gameConfiguration = new GameConfiguration();
        Game game = new Game(gameConfiguration);
        game.start();
    }


}