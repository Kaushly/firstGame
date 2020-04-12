package gamefight.character.monster.spawn;

import gamefight.character.monster.Monster;

public class PrototypeMonster {
    private Monster prototype;

    public PrototypeMonster(Monster prototype) {
        this.prototype = prototype;
    }

    public Monster getPrototype() {
        return prototype.clone();
    }
}
