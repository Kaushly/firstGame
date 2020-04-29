package ru.game.divvvan.command;

import ru.game.divvvan.character.Person;
import ru.game.divvvan.items.RealItem;

public class PutOn implements Command {
    @Override
    public void execute(Person person) {
        int number = 1;
        if(person.getBackPack().getItemsList().size() == 0){
            System.out.println();
            System.out.println("Рюкзак пуст");
            System.out.println();
        }else {
            System.out.println();
            for (RealItem inventory : person.getBackPack().getItemsList()) {
                System.out.println(number++ + " " + inventory.getName() + "(" + inventory.getType() + ")");
            }

            System.out.println();
        }


    }

    @Override
    public String name() {
        return "Надеть вещь";
    }
}
