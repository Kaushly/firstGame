import java.io.*;
import java.sql.SQLOutput;

//todo добавить  ограничение на взятие оружя у врага
/// TODO: 04.02.2020  добавить инвентарь в персонажа, куда можно положить вещи
//todo добавить во врага вещи, которые могут из него падать
// TODO: 04.02.2020 персонаж атакует врага и оба получают урон
//todo разгные враги создать
public class Main {

    private static WeaponFactory weaponFactory = new WeaponFactory();
    private static ArmorFactory armorFactory = new ArmorFactory();
    private static AccessoriesFactory accessoriesFactory = new AccessoriesFactory();

    public static void main(String[] args) throws IOException {
        Person mixail = getFirstPerson();
        Person lion = getSecondPerson();
        Zone1 orc = getFirstEnemy();
        boolean choice = false;
        while(!choice){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("1 - Зайти в магазин");
            System.out.println("2 - Информация о сопернике");
            System.out.println("3 - Информация о персонаже");
            System.out.println("4 - Атаковать");
            System.out.println("5 - Завершить игру");
            int numberMenu = Integer.parseInt(reader.readLine());
            switch (numberMenu){
                    case 1:
                        boolean shop = false;
                        while(!shop) {
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
                                    break;
                                case 2:
                                    Weapon weapon = showAllWeapons();
                                    mixail.setWeapon(weapon);
                                    break;
                                case 3:
                                    Accessories accessories = showAllAcessories();
                                    mixail.setAccessories(accessories);
                                    break;
                                case 0:
                                    shop = true;
                                    break;
                                default:
                                    shop = true;
                            }
                        }
                case 2:
                    System.out.println(orc);
                    break;
                case 3:
                    System.out.println(mixail);
                    break;
                case 4:
                    fight(mixail, lion);
                    break;
                case 5:
                    return;
                default:
                    choice = true;
            }

        }

    }

    private static void fight(Person maxail, Person lion) {
        while (maxail.isAlive() && lion.isAlive()) {
            maxail.strike(lion);
            lion.strike(maxail);
            System.out.println(maxail.getName() + " " + maxail.getHp());
            System.out.println(lion.getName() + " " + lion.getHp());
        }

        if (maxail.isAlive()) {
            System.out.println("Выиграл " + maxail.getName());
        } else {
            System.out.println("Выиграл " + lion.getName());
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

    private static Person getSecondPerson() {
        Person lion = new Person("Lion");
        return lion;
    }

    private static Person getFirstPerson() {
        Person maxail = new Person("Mixail");
        maxail.setHp(50);
        return maxail;
    }

    private static Zone1 getFirstEnemy() {
        Zone1 orc = new Zone1();
        return orc;
    }


}