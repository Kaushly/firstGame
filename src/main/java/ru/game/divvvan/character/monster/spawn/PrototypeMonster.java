package ru.game.divvvan.character.monster.spawn;

import ru.game.divvvan.character.monster.Monster;

public class PrototypeMonster {
    private Monster prototype;

    public PrototypeMonster(Monster prototype) {
        this.prototype = prototype;
    }

    public Monster getPrototype() {
        return prototype.clone();
    }
}
