package gamefight.command;

import gamefight.character.Drop;
import gamefight.character.Person;
import gamefight.character.monster.Monster;
import gamefight.service.FightService;
import gamefight.command.AccomLevel;

public class AtackTowerMonster implements Command {
    FightService fightService = new FightService();
    AccomLevel accomLevel = new AccomLevel();

    @Override
    public void execute(Person person) {
        Monster currentMonster = person.getTower().getCurrentMonster();
        if (currentMonster == null) {
            System.out.println("Тут пусто и нет монстра");
        } else {
            Drop drop = fightService.fight(person, currentMonster);
            person.setCoin(person.getCoin() + drop.getCoin());
            person.setXp(person.getXp() + drop.getXp());
            person.getTower().setCurrentMonster(null);
            System.out.println("Из монстра выпало: " + drop.getCoin() + " монеты");
            System.out.println("Вы заработали: " + drop.getXp() + " опыта");
            accomLevel.nextLevel(person);
        }
    }

    @Override
    public String name() {
        return "Атаковать монстра";
    }
}
