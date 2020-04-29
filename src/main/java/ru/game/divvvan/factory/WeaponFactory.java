package ru.game.divvvan.factory;

import lombok.Data;
import ru.game.divvvan.DropStrong;
import ru.game.divvvan.character.Person;
import ru.game.divvvan.items.ItemType;
import ru.game.divvvan.items.LoadItem;
import ru.game.divvvan.items.Weapon;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
@Data
public class WeaponFactory {
    private Map<Integer, Weapon> weapons = new HashMap<>();
    private Map<String, DropStrong> strong = new HashMap<>();

    public WeaponFactory() {
        weapons.put(1, new Weapon("Лук", 12, 1, ItemType.WEAPON, 999));
        weapons.put(2, new Weapon("Меч", 25, 3, ItemType.WEAPON, 999));
        weapons.put(3, new Weapon("Копье", 18, 2, ItemType.WEAPON, 999));

        strong.put("перчатка", new DropStrong("Перчатка", 2, 5));
        strong.put("кастет", new DropStrong("Кастет", 2, 12));
        strong.put("наручи", new DropStrong("Наручи", 6, 10));
    }


    public Weapon getWeaponByNumber(Integer weaponNumber) {
        return weapons.get(weaponNumber - 1);
    }

    public Set<String> getAllWeapons() {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        for (Weapon valum : weapons.values()) {
            set.add(valum.getName());
        }
        return set;
    }
}
