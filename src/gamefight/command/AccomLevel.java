package gamefight.command;

import gamefight.character.Person;


public class AccomLevel {
    private int xpToNextLevel;
    private Person person;

    public AccomLevel(){
//        this.xpToNextLevel;
    }

    public void nextLevel(Person person){
        if(person.getXp() >= xpToNextLevel){
            person.setXp(person.getXp() - xpToNextLevel);
            person.setAttack(person.getAttack() + (5 * person.getPersLevel()));
            person.setHp(person.getFullHp() + (10 * person.getPersLevel()));
            person.setDefense(person.getDefense()+ (4 * person.getPersLevel()));
            person.setCoin(person.getCoin() + (10 * person.getPersLevel()));
            xpToNextLevel = xpToNextLevel + (100 * person.getPersLevel());
            person.setPersLevel(person.getPersLevel() + 1);
            System.out.println("Уровень персонажа повышен до " + person.getPersLevel());
        }

    }

}
