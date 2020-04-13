package gamefight;

import gamefight.character.Person;
import gamefight.menu.StartMenu;

import java.io.IOException;

import static gamefight.Constants.WORLD_MAP;

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
