package gamefight.zone;

import gamefight.character.Person;
import gamefight.field.Field;

public class Zone {

    private Person orc = getFirstEnemy();
    private Field field = new Field();


    public Person getFirstEnemy() {
        Person orc = new Person("Trall");
        int min = 10;
        int max = 30;
        orc.setHp((int) (Math.random() * 100));
        orc.setAttack(orc.getAttack() + (int) (Math.random() * ((max - min) + 1) * 1));
//        orc.setArmor((int)Math.random() * 10);
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


