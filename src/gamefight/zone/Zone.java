package gamefight.zone;

import gamefight.character.Person;
import gamefight.field.Field;

public class Zone {

    private Person orc = getFirstEnemy();
    private Field field = new Field(5, 5, 5, 3);


    public Person getFirstEnemy() {
        Person orc = new Person("Trall");
        orc.setHp(orc.getHp() + (int) (Math.random() * 10));
        orc.setAttack(orc.getAttack() + (int) (Math.random() * 10));
        orc.setDefense(orc.getDefense() + (int) (Math.random() * 10));
        return orc;
    }

    @Override
    public String toString() {
        return "fight.zone.RedWood{" +
                "orc=" + orc +
                '}';
    }

    public void drawField() {
        field.drawField();
    }

    public void initField() {
        field.initField();
    }

    public Field getField() {
        return field;
    }
    // 1 2 3
    // 4 5 6
    // 7 8 9


}


