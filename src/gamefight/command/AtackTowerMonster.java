package gamefight.command;

import gamefight.character.Drop;
import gamefight.character.Person;
import gamefight.character.monster.Monster;
import gamefight.service.FightService;

public class AtackTowerMonster implements Command {
    FightService fightService = new FightService();
    LevelUp levelUp = new LevelUp();

    @Override
    public void execute(Person person) {
        Monster currentMonster = person.getTower().getCurrentMonster();
        if (currentMonster == null) {
            System.out.println("Тут пусто и нет монстра");
        } else {
            Drop drop = fightService.fight(person, currentMonster);
            person.setCoin(person.getCoin() + drop.getCoin());
            person.setExperience(person.getExperience() + drop.getExperience());
            person.getTower().setCurrentMonster(null);
            System.out.println("Из монстра выпало: " + drop.getCoin() + " монеты");
            System.out.println("Вы заработали: " + drop.getExperience() + " опыта");
            levelUp.nextLevel(person);
        }
    }

    @Override
    public String name() {
        return "Атаковать монстра";
    }
}
