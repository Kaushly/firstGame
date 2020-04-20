package ru.game.divvvan.menu;

import ru.game.divvvan.command.menu.ShowShoppingMenu;
import ru.game.divvvan.command.menu.ShowTowerMenu;
import ru.game.divvvan.command.menu.ShowZoneMenu;
import ru.game.divvvan.command.move.MoveDown;
import ru.game.divvvan.command.move.MoveLeft;
import ru.game.divvvan.command.move.MoveRight;
import ru.game.divvvan.command.move.MoveUp;
import ru.game.divvvan.command.*;

import java.util.ArrayList;
import java.util.List;

public class MenuFactory {

    public static List<Command> moveMenu() {
        List<Command> commands = new ArrayList<>();
        commands.add(new MoveDown());
        commands.add(new MoveUp());
        commands.add(new MoveLeft());
        commands.add(new MoveRight());
        return commands;
    }

    public static List<Command> actionMenu() {
        List<Command> commands = new ArrayList<>();
        commands.add(new InfoPerson());
        commands.add(new Attacking());
        commands.add(new InfoEnemy());
        return commands;
    }

    public static List<Command> startMenu() {
        List<Command> commands = new ArrayList<>();
        commands.add(new InfoPerson());
        commands.add(new ShowShoppingMenu());
        commands.add(new ShowZoneMenu());
        commands.add(new ShowTowerMenu());
        return commands;
    }

    public static List<Command> towerMenu() {
        List<Command> commands = new ArrayList<>();
        commands.add(new InfoPerson());
        commands.add(new NextMonster());
        commands.add(new AtackTowerMonster());
        commands.add(new AmounCoin());
        commands.add(new Experince());
        return commands;
    }
}
// в башке я могу каждый раз убиваю монстров с первого уровня и до 100+
// за каждого монстра я получаю монетки
// за монетки я могу прокачать скилы
// чем выше уровень - тем сложней монстры
// монстры всегда рандомные
//