package ru.game.divvvan.command;

import ru.game.divvvan.character.Drop;
import ru.game.divvvan.character.Person;
import ru.game.divvvan.character.monster.Monster;
import ru.game.divvvan.service.FightService;
import ru.game.divvvan.service.ShowPersonService;

public class AtackTowerMonster implements Command {
    private FightService fightService = new FightService();
    private LevelUpService levelUpService = new LevelUpService();
    private ShowPersonService showPersonService = new ShowPersonService();

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
            System.out.println("-------------------------------------");
            System.out.println("Из монстра выпало: " + drop.getCoin() + " монеты");
            System.out.println("Вы заработали: " + drop.getExperience() + " опыта");
            showPersonService.execute(person);
            System.out.println("-------------------------------------");
            if (person.getLevel() < 10) {
                levelUpService.nextLevel(person);
            }
        }

        if (Math.random() * 10 > 5) {
            System.out.println("ПОДНЯЛИ УРОВЕНЬ БАШНИ");
            person.getTower().upLevel();
        }
    }

    @Override
    public String name() {
        return "Атаковать монстра";
    }
}
