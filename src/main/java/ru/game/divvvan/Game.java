package ru.game.divvvan;

import ru.game.divvvan.character.Person;
import ru.game.divvvan.menu.StartMenu;

import java.io.IOException;

public class Game {

    private GameConfiguration configuration;
    private StartMenu menu = new StartMenu();

    public Game(GameConfiguration config) {
        this.configuration = config;
    }

    public void start() throws IOException {
        Person person = getFirstPerson();
        menu.show(person);
    }

    private Person getFirstPerson() {
        Person maxail = new Person("Mixail");
//        maxail.setHp(300);
        return maxail;
    }
}
