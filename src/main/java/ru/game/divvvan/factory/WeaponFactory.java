package ru.game.divvvan.factory;

import ru.game.divvvan.DropStrong;
import ru.game.divvvan.items.ItemType;
import ru.game.divvvan.items.Weapon;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class WeaponFactory {
    private Map<Integer, Weapon> weapons = new HashMap<>();
    private Map<String, DropStrong> strong = new HashMap<>();

    public WeaponFactory() {
        weapons.put(1, new Weapon("Лук", 12, 1, ItemType.WEAPON));
        weapons.put(2, new Weapon("Меч", 25, 3, ItemType.WEAPON));
        weapons.put(3, new Weapon("Копье", 18, 2, ItemType.WEAPON));

        strong.put("перчатка", new DropStrong("Перчатка", 2, 5));
        strong.put("кастет", new DropStrong("Кастет", 2, 12));
        strong.put("наручи", new DropStrong("Наручи", 6, 10));
    }


    public Weapon getWeaponByNumber(Integer weaponNumeber) {
        return weapons.get(weaponNumeber - 1);
    }

    public Set<String> getAllWeapons() {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        for (Weapon valum : weapons.values()) {
            set.add(valum.getName());
        }
        return set;
    }
}
