package gamefight.zone;

import gamefight.character.Person;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Zone {

    private Person orc = getFirstEnemy();
    private String[][] field;

    private String[][] init() {
        field = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                field[i][j] = "?";
            }
        }
        return field;
    }

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

    // 1 2 3
// 4 5 6
// 7 8 9
    public String[][] initField() {
        init();
        Set<Integer> enemy = new HashSet<>();
        for (int i = 0; i < 5; ) {
            if (isAdd(enemy)) {
                i++;
            }
        }

        for (Integer integer : enemy) {
            if (integer == 0) {
                field[0][0] = "*";
            } else if (integer == 1) {
                field[0][1] = "*";
            } else if (integer == 2) {
                field[0][1] = "*";
            } else if (integer == 3) {
                field[0][2] = "*";
            } else if (integer == 4) {
                field[1][0] = "*";
            } else if (integer == 5) {
                field[1][1] = "*";
            } else if (integer == 6) {
                field[1][2] = "*";
            } else if (integer == 7) {
                field[2][0] = "*";
            } else if (integer == 8) {
                field[2][1] = "*";
            }
        }

        return field;
    }

    public void drawField() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private boolean isAdd(Set<Integer> enemy) {
        int e = new Random().nextInt(9);
        return enemy.add(e);
    }

}


