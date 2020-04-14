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

    public Field(int wight, int height, int countMonster) {
        fieldElements = init(wight, height);
        this.wight = wight;
        this.height = height;
        this.countMonster = countMonster;
    }

    public void initField(Person person) {
        init(wight, height);
        setPerson(person);
        setEnemy();
        setChest();
    }

    private FieldElement[][] init(int wight, int height) {
        fieldElements = new FieldElement[wight][height];
        for (int i = 0; i < wight; i++) {
            for (int j = 0; j < height; j++) {
                fieldElements[i][j] = new EmptyField(new Coordinate(i, j));
            }
        }
        return fieldElements;
    }

    private void setPerson(Person person) {
        person.setCurrentField(this);
        fieldElements[person.getCoordinate().getX()][person.getCoordinate().getY()] = person;
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

    public void drawField() {
        System.out.print("  ");
        for (int i = 0; i < wight; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int j = 0; j < height; j++) {
            System.out.print(j + " ");
            for (int i = 0; i < wight; i++) {
                System.out.print(fieldElements[i][j].getSymbol() + " ");
            }
            System.out.println();

        }
        System.out.println();
    }


    public int getWight() {
        return wight;
    }

    public int getHeight() {
        return height;
    }

    public FieldElement[][] getFieldElements() {
        return fieldElements;
    }

}
