package ru.game.divvvan.menu;

import ru.game.divvvan.factory.AccessoriesFactory;
import ru.game.divvvan.factory.ArmorFactory;
import ru.game.divvvan.factory.WeaponFactory;
import ru.game.divvvan.character.Person;
import ru.game.divvvan.items.Accessories;
import ru.game.divvvan.items.Armor;
import ru.game.divvvan.items.Weapon;
import ru.game.divvvan.utils.ConsoleUtils;

public class ShoppingMenu {
    private WeaponFactory weaponFactory = new WeaponFactory();
    private ArmorFactory armorFactory = new ArmorFactory();
    private AccessoriesFactory accessoriesFactory = new AccessoriesFactory();

    public void showMenu(Person person) {
        while (true) {
            printShopMenu();
            switch (ConsoleUtils.getIntFromConsole()) {
                case 1:
                    Armor armor = showAllArmor();
                    person.take(armor);
                    System.out.println(person.getName() + " положил в сумку " + armor.getName());
                    break;
                case 2:
                    Weapon weapon = showAllWeapons();
                    person.take(weapon);
                    System.out.println(person.getName() + " положил в сумку " + weapon.getName());
                    break;
                case 3:
                    Accessories accessories = showAllAcessories();
                    person.take(accessories);
                    System.out.println(person.getName() + " положил в сумку " + accessories.getName());
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


    private Accessories showAllAcessories() {
        while (true) {
            int number = 1;
            for (String allAccessorie : accessoriesFactory.getAllAccessories()) {
                System.out.println(number++ + " " + allAccessorie);
            }
            System.out.print("Выбери предмет:  ");
            return accessoriesFactory.getAccessoriesByNumber(ConsoleUtils.getIntFromConsole() + 1);

        }
    }

    private Armor showAllArmor() {
        while (true) {
            int number = 1;
            for (String allArmor : armorFactory.getAllArmors()) {
                System.out.println(number++ + " " + allArmor);
            }
            System.out.print("Выбери предмет: ");
            return armorFactory.getArmorByNumber(ConsoleUtils.getIntFromConsole() + 1);
        }
    }

    private Weapon showAllWeapons() {
        while (true) {
            int number = 1;
            for (String allWeapons : weaponFactory.getAllWeapons()) {
                System.out.println(number++ + " " + allWeapons);
            }
            System.out.print("Выбери предмет: ");
            return weaponFactory.getWeaponByNumber(ConsoleUtils.getIntFromConsole() + 1);
        }
    }
}
