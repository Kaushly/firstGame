package gamefight.field;

import gamefight.character.*;

import java.util.Random;

public class Field {

    private FieldElement[][] fieldElements;
    private int wight;
    private int height;
    private int countMonster;
    private int lifeMonster;
    private int countChest;
    private int lifeChest;

    public Field(int wight, int height, int countMonster, int countChest) {
        fieldElements = init(wight, height);
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
        fieldElements[personField.getCoordinate().getX()][personField.getCoordinate().getY()] = personField;
    }

    private void setEnemy() {
        while (lifeMonster != countMonster) {
            Coordinate coordinate = new Coordinate(new Random().nextInt(wight), new Random().nextInt(height));
            if (fieldElements[coordinate.getX()][coordinate.getY()].getType() == FieldType.EMPTY) {
                lifeMonster++;
                EnemyField enemyField = new EnemyField(coordinate);
                enemyField.setEnemy(new Enemy("Ork"));
                fieldElements[coordinate.getX()][coordinate.getY()] = enemyField;
            }
        }
    }

    private void setChest() {
        while (lifeChest != countChest) {
            Coordinate coordinate = new Coordinate(new Random().nextInt(wight), new Random().nextInt(height));
            if (fieldElements[coordinate.getX()][coordinate.getY()].getType() == FieldType.EMPTY) {
                lifeChest++;
                fieldElements[coordinate.getX()][coordinate.getY()] = new ChestField(coordinate);
            }
        }
    }

    private FieldElement[][] init(int wight, int height) {
        fieldElements = new FieldElement[wight][height];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < wight; j++) {
                fieldElements[i][j] = new EmptyField(new Coordinate(i, j));
            }
        }
        return fieldElements;
    }

    public void drawField() {
        for (int j = 0; j < height; j++) {
            for (int i = 0; i < wight; i++) {
                System.out.print(fieldElements[i][j].getSymbol() + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void go(PersonField personField) {
        Coordinate coordinate = personField.getCoordinate();
        if (checkBorderZone(coordinate)) {
            System.out.println("Вы перемащаетесь на координаты " + coordinate);

            switch (fieldElements[coordinate.getX()][coordinate.getY()].getType()) {
                case MONSTER:
                    fieldElements[coordinate.getX()][coordinate.getY()].action(personField.getPerson());
                    fieldElements[coordinate.getX()][coordinate.getY()] = new EmptyField(new Coordinate(coordinate.getX(), coordinate.getY()));
                case EMPTY:
                    fieldElements[coordinate.getX()][coordinate.getY()] = new PersonField(new Coordinate(coordinate.getX(), coordinate.getY()));
                case CHEST:
                    fieldElements[coordinate.getX()][coordinate.getY()].action(personField.getPerson());
            }
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
