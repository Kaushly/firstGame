package ru.game.divvvan.menu;

import ru.game.divvvan.character.BackPack;
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
                    if(person.getCoin() >= armor.getPrice()){
                        person.take(armor);
                        person.setCoin(person.getCoin() - armor.getPrice());
                        System.out.println(person.getName() + " положил в сумку " + armor.getName());
                        System.out.println("Осталось " + person.getCoin() + " монет");
                    }else {
                        long i = armor.getPrice() - person.getCoin();
                        System.out.println("Вам не хватает " + i + " монет для покупки " + armor.getName());
                    }
                    break;
                case 2:
                    Weapon weapon = showAllWeapons();
                    if(person.getCoin() >= weapon.getPrice()){
                        person.take(weapon);
                        person.setCoin(person.getCoin() - weapon.getPrice());
                        System.out.println(person.getName() + " положил в сумку " + weapon.getName());
                        System.out.println("Осталось " + person.getCoin() + " монет");
                    }else {
                        long i = weapon.getPrice() - person.getCoin();
                        System.out.println("Вам не хватает " + i + " монет для покупки " + weapon.getName());
                    }
                    break;
                case 3:
                    Accessories accessories = showAllAcessories();
                    if(person.getCoin() >= accessories.getPrice()){
                        person.take(accessories);
                        person.setCoin(person.getCoin() - accessories.getPrice());
                        System.out.println(person.getName() + " положил в сумку " + accessories.getName());
                        person.getBackPack().addItem(accessories);
                        System.out.println("Осталось " + person.getCoin() + " монет");
                    }else {
                        long i = accessories.getPrice() - person.getCoin();
                        System.out.println("Вам не хватает " + i + " монет для покупки " + accessories.getName());
                    }
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
            return accessoriesFactory.getAccessoriesByNumber(ConsoleUtils.getIntFromConsole() + 1);

        }
    }

    private Armor showAllArmor() {
        while (true) {
            int number = 1;
            for (String allArmor : armorFactory.getAllArmors()) {
                System.out.println(number++ + " " + allArmor + " (стоимость &&&)");
            }
            return armorFactory.getArmorByNumber(ConsoleUtils.getIntFromConsole() + 1);
        }
    }

    private Weapon showAllWeapons() {
        while (true) {
            int number = 1;
            for (String allWeapons : weaponFactory.getAllWeapons()) {
                System.out.println(number++ + " " + allWeapons);
            }
            return weaponFactory.getWeaponByNumber(ConsoleUtils.getIntFromConsole() + 1);
        }
    }
}
