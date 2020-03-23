package gamefight;

import gamefight.character.Enemy;
import gamefight.character.Person;
import gamefight.items.Accessories;
import gamefight.items.Armor;
import gamefight.items.Weapon;
import gamefight.zone.Zone;

import java.io.*;
//   ? ? ?
// ? * * * ?
// ? * * * ?
// ? * * * ?
//   & & &
// & - место появления персонажа
// * - пусто/монстр/сундук
// ? - выход на следующую зону


//todo добавить  ограничение на взятие оружя у врага
/// TODO: 04.02.2020  добавить инвентарь в персонажа, куда можно положить вещи
//todo добавить во врага вещи, которые могут из него падать
// TODO: 04.02.2020 персонаж атакует врага и оба получают урон
//todo разгные враги создать
public class Main {

    private static WeaponFactory weaponFactory = new WeaponFactory();
    private static ArmorFactory armorFactory = new ArmorFactory();
    private static AccessoriesFactory accessoriesFactory = new AccessoriesFactory();
    private static Zone zone = new Zone();

    public static void main(String[] args) throws IOException {
        Person mixail = getFirstPerson();
        boolean choice = false;
        while (!choice) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("1 - Зайти в магазин");
            System.out.println("2 - Атаковать монстра");
            System.out.println("3 - Информация о персонаже");
            System.out.println("4 - Перейти поле");
            System.out.println("5 - Показать поле");
            System.out.println("0 - Завершить игру");
            int numberMenu = Integer.parseInt(reader.readLine());
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
                default:
                    choice = true;
            }
        }
    }

    private static void resetLocateAndCharacter(Person mixail) {
        mixail.setHp(0);
    }

    private static void shopping(Person mixail) throws IOException {
        boolean shop = false;
        while (!shop) {
            BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("1 - Броня");
            System.out.println("2 - Оружие");
            System.out.println("3 - Аксессуар");
            System.out.println("0 - Вернуться в основное меню");
            int shopMenu = Integer.parseInt(reader1.readLine());
            switch (shopMenu) {
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

    private static void fight(Person maxail, Person enemy) {
        while (maxail.isAlive() && enemy.isAlive()) {
            maxail.strike(enemy);
            enemy.strike(maxail);
            System.out.println(maxail.getName() + " " + maxail.getHp());
            System.out.println(enemy.getName() + " " + enemy.getHp());
        }
    }

    private static Weapon showAllWeapons() throws IOException {
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

    private static Accessories showAllAcessories() throws IOException {
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

    private static Armor showAllArmor() throws IOException {
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

    private static Person getFirstPerson() {
        Person maxail = new Person("Mixail");
        maxail.setHp(300);
        return maxail;
    }
}