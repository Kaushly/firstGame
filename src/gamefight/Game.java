package gamefight;

import gamefight.character.Person;
import gamefight.items.Accessories;
import gamefight.items.Armor;
import gamefight.items.Weapon;
import gamefight.zone.Zone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {
    private WeaponFactory weaponFactory = new WeaponFactory();
    private ArmorFactory armorFactory = new ArmorFactory();
    private AccessoriesFactory accessoriesFactory = new AccessoriesFactory();
    private Zone zone = new Zone();
    private GameConfiguration configuration;
    private BufferedReader reader;

    public Game(GameConfiguration config) {
        this.configuration = config;
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public void start() throws IOException {
        Person mixail = getFirstPerson();
        startMenu(mixail);
    }

    private void startMenu(Person mixail) throws IOException {
        while (true) {
            printMenu();
            int numberMenu = getIntFromConsole();
            switch (numberMenu) {
                case 1:
                    shopping(mixail);
                    break;
                case 2:
                    Person currentEnemy = zone.getFirstEnemy();
                    fight(mixail, currentEnemy);
                    if (mixail.isAlive()) {
                        System.out.println("Вы выжили с hp =  " + mixail.getHp());
                        break;
                    } else {
                        System.out.println("Вы проиграли, возвращаетесь в город");
                        resetLocateAndCharacter(mixail);
                    }
//                    System.out.println("выберете зону");//todo выбрать зону
                    break;
                case 3:
                    System.out.println(mixail);
                    break;
                case 4:
                    zone.initField();
                    break;
                case 5:
                    zone.drawField();
                    break;
                case 0:
                    return;
            }
        }
    }

    private void printMenu() {
        System.out.println("1 - Зайти в магазин");
        System.out.println("2 - Атаковать монстра");
        System.out.println("3 - Информация о персонаже");
        System.out.println("4 - Перейти поле");
        System.out.println("5 - Показать поле");
        System.out.println("0 - Завершить игру");
    }

    private int getIntFromConsole() {
        try {
            String s = reader.readLine();
            return Integer.parseInt(s);
        } catch (Exception e) {
            System.out.println("Вы ввели некорректное число, попробуйте еще раз");
            printMenu();
            return getIntFromConsole();
        }
    }

    private void resetLocateAndCharacter(Person mixail) {
        mixail.setHp(0);
    }

    private void shopping(Person mixail) throws IOException {
        boolean shop = false;
        while (!shop) {
            printShopMenu();
            switch (getIntFromConsole()) {
                case 1:
                    Armor armor = showAllArmor();
                    mixail.setArmor(armor);
                    System.out.println(mixail.getName() + " одел " + armor.getName());
                    break;
                case 2:
                    Weapon weapon = showAllWeapons();
                    mixail.setWeapon(weapon);
                    System.out.println(mixail.getName() + " одел " + weapon.getName());
                    break;
                case 3:
                    Accessories accessories = showAllAcessories();
                    mixail.setAccessories(accessories);
                    System.out.println(mixail.getName() + " одел " + accessories.getName());
                    break;
                case 0:
                    shop = true;
                    break;
                default:
                    shop = true;
            }
        }
    }

    private void printShopMenu() {
        System.out.println("1 - Броня");
        System.out.println("2 - Оружие");
        System.out.println("3 - Аксессуар");
        System.out.println("0 - Вернуться в основное меню");
    }

    private void fight(Person maxail, Person enemy) {
        while (maxail.isAlive() && enemy.isAlive()) {
            maxail.strike(enemy);
            enemy.strike(maxail);
            System.out.println(maxail.getName() + " " + maxail.getHp());
            System.out.println(enemy.getName() + " " + enemy.getHp());
        }
    }

    private Weapon showAllWeapons() throws IOException {
        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int number = 1;
            for (String allWeapon : weaponFactory.getAllWeapons()) {
                System.out.println(number++ + " " + allWeapon);
            }
            System.out.print("Название предмета: ");
            String name = reader.readLine();
            System.out.println();

            return weaponFactory.getWeaponByName(name);

        }
    }

    private Accessories showAllAcessories() throws IOException {
        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int number = 1;
            for (String allAccessorie : accessoriesFactory.getAllAccessories()) {
                System.out.println(number++ + " " + allAccessorie);
            }
            System.out.print("Название предмета: ");
            String name = reader.readLine();
            System.out.println();
            return accessoriesFactory.getAccessoriesByName(name);

        }
    }

    private Armor showAllArmor() throws IOException {
        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int number = 1;
            for (String allArmor : armorFactory.getAllArmors()) {
                System.out.println(number++ + " " + allArmor);
            }
            System.out.print("Название предмета: ");
            String name = reader.readLine();
            System.out.println();
            return armorFactory.getArmorByName(name);

        }
    }

    private Person getFirstPerson() {
        Person maxail = new Person("Mixail");
        maxail.setHp(300);
        return maxail;
    }
}
