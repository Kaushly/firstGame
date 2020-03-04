import java.util.HashMap;
import java.util.Map;

public class WeaponFactory {
    private Map<String, Weapon> map = new HashMap<>();
    private Map<String, DropStrong> strong = new HashMap<>();

    //todo разнести на разные фабрики
    public WeaponFactory() {
        map.put("лук", new Weapon("Лук", 12, 1, "Дальнее", 17));
        map.put("меч", new Weapon("Меч", 25, 3, "Ближнее", 20));
        map.put("копье", new Weapon("Копье", 18, 2, "Среднее", 18));

        strong.put("перчатка", new DropStrong("Перчатка", 2, 5));
        strong.put("кастет", new DropStrong("Кастет", 2, 12));
        strong.put("наручи", new DropStrong("Наручи", 6, 10));
    }


    public Weapon getWeaponByName(String dropName) {
        return map.get(dropName.toLowerCase());
    }

//    public Accessories getDropHPByName(String dropName) {
//        return hp.get(dropName.toLowerCase());
//    }


//    public DropArmor getWeaponByName(String DropName) {
//        return armor.get(DropName.toLowerCase());
//}
//    public DropStrong getWeaponByName(String DropName) {
//        return strong.get(DropName.toLowerCase());
//    }
//    public DropHP getWeaponByName(String DropName) {
//        return hp.get(DropName.toLowerCase());
//    }
}
