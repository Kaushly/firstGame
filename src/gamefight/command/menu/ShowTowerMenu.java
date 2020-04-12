package gamefight.command.menu;

import gamefight.character.Person;
import gamefight.command.Command;
import gamefight.menu.ShoppingMenu;
import gamefight.menu.TowerMenu;

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
