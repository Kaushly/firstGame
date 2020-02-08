import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
//todo добавить  ограничение на взятие оружя у врага
/// TODO: 04.02.2020  добавить инвентарь в персонажа, куда можно положить вещи
// TODO: 04.02.2020 создать фабрику вещей - сделал!!!!
//todo добавить во врага вещи, которые могут из него падать
// TODO: 04.02.2020 персонаж атакует врага и оба получают урон
//todo разгные враги создать
public class Main {

    public static void main(String[] args) {

        WeaponFactory weaponFactory = new WeaponFactory();
        Person vasya = new Person("Vasya");
        Weapon bow = weaponFactory.getWeaponByName("лук");
        DropHP talisman = weaponFactory.getDropHPByName("Талисман");
        vasya.setWeapon(bow);
        vasya.setDropHP(talisman);


        Enemy dima = new Enemy("Dima", 12, 100, 21);
        Weapon sword = weaponFactory.getWeaponByName("меч");
        dima.setWeapon(sword);
        System.out.println(vasya);
        System.out.println("Получаем полное количество ХП у Васи" + vasya.getFullHP());
        System.out.println(dima);



    }

}