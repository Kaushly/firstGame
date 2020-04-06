package gamefight.menu;

import gamefight.command.*;
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
        commands.add(new Attacking());
        commands.add(new InfoEnemy());
        commands.add(new InfoPerson());
        return commands;
    }
}
