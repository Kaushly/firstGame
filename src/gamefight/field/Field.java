package gamefight.field;

import gamefight.character.*;

import java.util.Random;

public class Field {

    private FieldElement[][] field;
    private int wight;
    private int height;
    private int countMonster;
    private int lifeMonster;
    private int countChest;
    private int lifeChest;

    public Field(int wight, int height, int countMonster, int countChest) {
        field = init(wight, height);
        this.wight = wight;
        this.height = height;
        this.countMonster = countMonster;
        this.countChest = countChest;
    }

    public void initField(PersonField personField) {
        init(wight, height);
        setPerson(personField);
        setEnemy();
        setChest();
    }

    private void setPerson(PersonField personField) {
        field[personField.getCoordinate().getX()][personField.getCoordinate().getY()] = personField;
    }

    private void setEnemy() {
        while (lifeMonster != countMonster) {
            Coordinate coordinate = new Coordinate(new Random().nextInt(wight), new Random().nextInt(height));
            if (field[coordinate.getX()][coordinate.getY()].getType() == FieldType.EMPTY) {
                lifeMonster++;
                field[coordinate.getX()][coordinate.getY()] = new EnemyField(coordinate);
            }
        }
    }

    private void setChest() {
        while (lifeChest != countChest) {
            Coordinate coordinate = new Coordinate(new Random().nextInt(wight), new Random().nextInt(height));
            if (field[coordinate.getX()][coordinate.getY()].getType() == FieldType.EMPTY) {
                lifeChest++;
                field[coordinate.getX()][coordinate.getY()] = new ChestField(coordinate);
            }
        }
    }

    private FieldElement[][] init(int wight, int height) {
        field = new FieldElement[wight][height];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < wight; j++) {
                field[i][j] = new EmptyField(new Coordinate(i, j));
            }
        }
        return field;
    }

    public void drawField() {
        for (int j = 0; j < height; j++) {
            for (int i = 0; i < wight; i++) {
                System.out.print(field[i][j].getCharacter());
            }
            System.out.println();
        }
        System.out.println();
    }

    public void go(Coordinate coordinate) {
        if (checkBorderZone(coordinate)) {
            System.out.println("Вы перемащаетесь на координаты " + coordinate);
            if (field[coordinate.getX()][coordinate.getY()].getType() == FieldType.MONSTER) {
                System.out.println("Вы убили монстра");
                field[coordinate.getX()][coordinate.getY()] = new EmptyField(new Coordinate(coordinate.getX(), coordinate.getY()));
            } else
                field[coordinate.getX()][coordinate.getY()] = new PersonField(new Coordinate(coordinate.getX(), coordinate.getY()));
        } else {
            coordinate.clearCoordinate();
            System.out.println("Вы вступили на запретную зону");
        }
    }

    private boolean checkBorderZone(Coordinate coordinate) {
        return coordinate.getX() < wight && coordinate.getY() < height && coordinate.getY() >= 0
                && coordinate.getX() >= 0;
    }

    public int getWight() {
        return wight;
    }

    public int getHeight() {
        return height;
    }
}
