package gamefight.command;

import gamefight.character.Drop;
import gamefight.character.Person;
import gamefight.character.monster.Monster;
import gamefight.service.FightService;

public class AtackTowerMonster implements Command {
    FightService fightService = new FightService();

    @Override
    public void execute(Person person) {
        Monster currentMonster = person.getTower().getCurrentMonster();
        if (currentMonster == null) {
            System.out.println("Тут пусто и нет монстра");
        } else {
            Drop drop = fightService.fight(person, currentMonster);
            person.setCoin(person.getCoin() + drop.getCoin());
            person.getTower().setCurrentMonster(null);
            System.out.println("Из монстра выпало" + drop);
        }
    }

    @Override
    public String name() {
        return "Атаковать монстра";
    }
}
