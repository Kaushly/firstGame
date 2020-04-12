package gamefight.command.menu;

import gamefight.character.Person;
import gamefight.command.Command;
import gamefight.menu.ShoppingMenu;

public class ShowShoppingMenu implements Command {
    private ShoppingMenu shopping = new ShoppingMenu();

    @Override
    public void execute(Person person) {
        shopping.showMenu(person);
    }

    @Override
    public String name() {
        return "Меню магазина";
    }
}
