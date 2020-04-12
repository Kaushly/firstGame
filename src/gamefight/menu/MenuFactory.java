package gamefight.menu;

import gamefight.command.*;
import gamefight.command.menu.ShowShoppingMenu;
import gamefight.command.menu.ShowTowerMenu;
import gamefight.command.menu.ShowZoneMenu;
import gamefight.command.move.MoveDown;
import gamefight.command.move.MoveLeft;
import gamefight.command.move.MoveRight;
import gamefight.command.move.MoveUp;

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
        return commands;
    }
}
// в башке я могу каждый раз убиваю монстров с первого уровня и до 100+
// за каждого монстра я получаю монетки
// за монетки я могу прокачать скилы
// чем выше уровень - тем сложней монстры
// монстры всегда рандомные
//