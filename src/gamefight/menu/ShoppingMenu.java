package gamefight.menu;

import gamefight.AccessoriesFactory;
import gamefight.ArmorFactory;
import gamefight.WeaponFactory;
import gamefight.character.Person;
import gamefight.items.Accessories;
import gamefight.items.Armor;
import gamefight.items.Weapon;
import gamefight.utils.ConsoleUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShoppingMenu {
    private WeaponFactory weaponFactory = new WeaponFactory();
    private ArmorFactory armorFactory = new ArmorFactory();
    private AccessoriesFactory accessoriesFactory = new AccessoriesFactory();

    public void showMenu(Person person) throws IOException {
        while (true) {
            printShopMenu();
            switch (ConsoleUtils.getIntFromConsole()) {
                case 1:
                    Armor armor = showAllArmor();
                    person.setArmor(armor);
                    System.out.println(person.getName() + " одел " + armor.getName());
                    break;
                case 2:
                    Weapon weapon = showAllWeapons();
                    person.setWeapon(weapon);
                    System.out.println(person.getName() + " одел " + weapon.getName());
                    break;
                case 3:
                    Accessories accessories = showAllAcessories();
                    person.setAccessories(accessories);
                    System.out.println(person.getName() + " одел " + accessories.getName());
                    break;
                case 0:
                    return;
            }
        }
    }

    private void printShopMenu() {
        System.out.println("1 - Броня");
        System.out.println("2 - Оружие");
        System.out.println("3 - Аксессуар");
        System.out.println("0 - Вернуться в основное меню");
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
}
