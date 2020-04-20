package ru.game.divvvan.command.menu;

import ru.game.divvvan.character.Person;
import ru.game.divvvan.command.Command;
import ru.game.divvvan.menu.ShoppingMenu;

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
