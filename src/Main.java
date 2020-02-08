//todo добавить  ограничение на взятие оружя у врага
/// TODO: 04.02.2020  добавить инвентарь в персонажа, куда можно положить вещи
// TODO: 04.02.2020 создать фабрику вещей - сделал!!!!
//todo добавить во врага вещи, которые могут из него падать
// TODO: 04.02.2020 персонаж атакует врага и оба получают урон
//todo разгные враги создать
public class Main {

    private static WeaponFactory weaponFactory = new WeaponFactory();
    private static ArmorFactory armorFactory = new ArmorFactory();

    public static void main(String[] args) {

//        Person vasya = new Person("Vasya");
//        Weapon bow = weaponFactory.getWeaponByName("лук");
//        Accessories talisman = weaponFactory.getDropHPByName("Талисман");
//        vasya.setWeapon(bow);
//        vasya.setAccessories(talisman);
//
//
//        Enemy dima = new Enemy("Dima", 12, 100, 21);
//        Weapon sword = weaponFactory.getWeaponByName("меч");
//        dima.setWeapon(sword);
//        System.out.println(vasya);
//        System.out.println("Получаем полное количество ХП у Васи" + vasya.getFullHP());
//        System.out.println(dima);

        //todo command+p
        Person maxail = new Person("Mixail");
        armorFactory.getAllArmors().forEach(System.out::println);
        System.out.println(maxail);
        maxail.setArmor(armorFactory.getArmorByName("шлем"));
        System.out.println(maxail);
        maxail.setArmor(armorFactory.getArmorByName("доспех"));
        System.out.println(maxail);


//todo сделать игровой цикл while

    }

}