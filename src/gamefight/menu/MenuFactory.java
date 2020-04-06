package gamefight.menu;

import gamefight.command.*;

import java.util.ArrayList;
import java.util.List;

public class MenuFactory {

    public static ZoneMenu zoneMenu() {
        List<Command> commands = new ArrayList<>();
        commands.add(new MoveDown());
        commands.add(new MoveUp());
        commands.add(new MoveLeft());
        commands.add(new MoveRight());
        commands.add(new Jump());
        return new ZoneMenu(commands);
    }
}
