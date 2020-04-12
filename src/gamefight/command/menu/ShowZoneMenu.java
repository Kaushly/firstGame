package gamefight.command.menu;

import gamefight.character.Person;
import gamefight.command.Command;
import gamefight.menu.ZoneMenu;

public class ShowZoneMenu implements Command {
    private ZoneMenu zoneMenu = new ZoneMenu();
    @Override
    public void execute(Person person) {
        zoneMenu.show();
    }

    @Override
    public String name() {
        return "Войти в зону";
    }
}
