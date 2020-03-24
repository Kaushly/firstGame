package gamefight;

import gamefight.items.Weapon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WeaponFactory {
    private Map<String, Weapon> weapons = new HashMap<>();
    private Map<String, DropStrong> strong = new HashMap<>();

    //todo разнести на разные фабрики
    public WeaponFactory() {
        weapons.put("лук", new Weapon("Лук", 12, 1, "Дальнее", 17));
        weapons.put("меч", new Weapon("Меч", 25, 3, "Ближнее", 20));
        weapons.put("копье", new Weapon("Копье", 18, 2, "Среднее", 18));

        strong.put("перчатка", new DropStrong("Перчатка", 2, 5));
        strong.put("кастет", new DropStrong("Кастет", 2, 12));
        strong.put("наручи", new DropStrong("Наручи", 6, 10));
    }


    public Weapon getWeaponByName(String dropName) {
        return weapons.get(dropName.toLowerCase());
    }

    public Set<String> getAllWeapons() {
        return weapons.keySet();
    }

    public Weapon showAllWeapons() throws IOException {
        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int number = 1;
            for (String allWeapon : getAllWeapons()) {
                System.out.println(number++ + " " + allWeapon);
            }
            System.out.print("Название предмета: ");
            String name = reader.readLine();
            System.out.println();

            return getWeaponByName(name);
        }
    }

}
