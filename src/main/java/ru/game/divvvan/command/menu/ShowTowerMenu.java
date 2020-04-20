package ru.game.divvvan.command.menu;

import ru.game.divvvan.character.Person;
import ru.game.divvvan.command.Command;
import ru.game.divvvan.menu.TowerMenu;

public class ShowTowerMenu implements Command {
    private TowerMenu towerMenu = new TowerMenu();

    @Override
    public void execute(Person person) {
        towerMenu.show(person);
    }

    @Override
    public String name() {
        return "Башня";
    }
}
