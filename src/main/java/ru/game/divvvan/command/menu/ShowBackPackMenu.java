package ru.game.divvvan.command.menu;

import ru.game.divvvan.character.BackPack;
import ru.game.divvvan.character.Person;
import ru.game.divvvan.command.Command;
import ru.game.divvvan.menu.BackPackMenu;
import ru.game.divvvan.menu.ShoppingMenu;

public class ShowBackPackMenu implements Command {
    private BackPackMenu backPack = new BackPackMenu();

    @Override
    public void execute(Person person) {
        backPack.packMenu(person);
    }

    @Override
    public String name() {
        return "Рюкзак";
    }

}
