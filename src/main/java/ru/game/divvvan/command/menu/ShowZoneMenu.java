package ru.game.divvvan.command.menu;

import ru.game.divvvan.character.Person;
import ru.game.divvvan.command.Command;
import ru.game.divvvan.menu.ZoneMenu;

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
