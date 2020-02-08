import java.util.HashMap;
import java.util.Map;

public class WeaponFactory {
    private Map<String, Weapon> map = new HashMap<>();
    private Map<String, DropHP> hp = new HashMap<>();
    private Map<String, DropArmor> armor = new HashMap<>();
    private Map<String, DropStrong> strong = new HashMap<>();
//todo разнести на разные фабрики
    public WeaponFactory() {
        map.put("лук", new Weapon("Лук", 12, 1, "Дальнее", 17));
        map.put("меч",   new Weapon("Меч", 25, 3, "Ближнее", 20));
        map.put("копье",   new Weapon("Копье", 18, 2, "Среднее", 18));

        armor.put("накидка", new DropArmor("Накидка", 2, 30));
        armor.put("плащ", new DropArmor("Плащ", 2,40));
        armor.put("кольчуга", new DropArmor("Кольчуга", 10,60));
        armor.put("доспех", new DropArmor("Железный доспех", 20, 80));
        hp.put("кольцо", new DropHP("Кольцо",0.1, 10));
        hp.put("ожерелье", new DropHP("Ожерелье", 0.5, 15));
        hp.put("талисман", new DropHP("Талисман", 0.2, 20));
        strong.put("перчатка", new DropStrong("Перчатка", 2, 5));
        strong.put("кастет", new DropStrong("Кастет", 2, 12));
        strong.put("наручи", new DropStrong("Наручи", 6, 10));
    }


    public Weapon getWeaponByName(String dropName) {
        return map.get(dropName.toLowerCase());
    }
    public DropHP getDropHPByName(String dropName) {
        return hp.get(dropName.toLowerCase());
    }


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
