package gamefight.command;

import gamefight.character.Drop;
import gamefight.character.Person;
import gamefight.service.FightService;

public class AtackTowerMonster implements Command {
    FightService fightService = new FightService();

    @Override
    public void execute(Person person) {
        Person currentEnemy = person.getTower().getCurrentEnemy();
        if (currentEnemy == null) {
            System.out.println("Тут пусто и нет монстра");
        } else {
            Drop drop = fightService.fight(person, currentEnemy);
            person.setCoin(person.getCoin() + drop.getCoin());
            person.getTower().setCurrentEnemy(null);
            System.out.println("Из монстра выпало" + drop);
        }
    }

    @Override
    public String name() {
        return "Атаковать монстра";
    }
}
