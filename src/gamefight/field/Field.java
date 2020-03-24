package gamefight.field;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Field {

    private String[][] field;

    public String[][] initField() {
        init();
        Set<Integer> enemy = new HashSet<>();
        for (int i = 0; i < 3; ) {
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

    private String[][] init() {
        field = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                field[i][j] = "?";
            }
        }
        return field;
    }

    public void drawField() {
        for (int j = 0; j < field.length; j++) {
            for (int i = 0; i < field.length; i++) {
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

    public void go(Coordinate coordinate) {
        if (coordinate.getX() < field.length && coordinate.getY() < field.length && coordinate.getY() >= 0 && coordinate.getX() >= 0) {
            System.out.println("Вы перемащаетесь на координаты " + coordinate);
            if (field[coordinate.getX()][coordinate.getY()].equals("*")) {
                System.out.println("Вы убили монстра");
                field[coordinate.getX()][coordinate.getY()] = "X";
            }
        } else {
            coordinate.clearCoordinate();
            System.out.println("Вы вступили на запретную зону");
        }
    }


}
