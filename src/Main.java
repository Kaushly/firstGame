import java.io.*;

//todo добавить  ограничение на взятие оружя у врага
/// TODO: 04.02.2020  добавить инвентарь в персонажа, куда можно положить вещи
// TODO: 04.02.2020 создать фабрику вещей - сделал!!!!
//todo добавить во врага вещи, которые могут из него падать
// TODO: 04.02.2020 персонаж атакует врага и оба получают урон
//todo разгные враги создать
public class Main {

    private static WeaponFactory weaponFactory = new WeaponFactory();
    private static ArmorFactory armorFactory = new ArmorFactory();
    private static AccessoriesFactory accessoriesFactory = new AccessoriesFactory();

    public static void main(String[] args) throws IOException {
        //todo command+p
        Person maxail = getFirstPerson();
        Person lion = getSecondPerson();
        boolean gameOver = false;
        while (!gameOver) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("1 - Показать броню");
            System.out.println("2 - Показать аксесуары");
            System.out.println("3 - Информация о персонаже");
            System.out.println("4 - Атаковать");
            int numberMenu = Integer.parseInt(reader.readLine());
            //todo добавь выбор оружие и объедени весь выбор одежды в отдельное меню
            switch (numberMenu) {
                case 1:
                    Armor armor = showAllArmor();
                    maxail.setArmor(armor);
                    break;
                case 2:
                    Accessories accessories = showAllAcessories();
                    maxail.setAccessories(accessories);
                    break;
                case 3:
                    System.out.println(maxail);
                    break;
                case 4:
                    fight(maxail, lion);
                    break;
                default:
                    gameOver = true;
            }
        }


//todo сделать игровой цикл while
//        while(maxail.getHp() <= 0 || lion.getHp() <= 0){
//             lion.setHp(lion.getHp() - maxail.getFullDamage());
//             maxail.setHp( maxail.getHp() - lion.getFullDamage());
//             if (lion.getHp() <= 0){
//                 System.out.println("Победу одержал" + name.person);
//            }
////
//        }

//        while ()


    }

    private static void fight(Person maxail, Person lion) {
        while (maxail.isAlive() && lion.isAlive()) {
            maxail.strike(lion);
            lion.strike(maxail);
            System.out.println(maxail.getName() + " " + maxail.getHp());
            System.out.println(lion.getName() + " " + lion.getHp());
        }

        if (maxail.isAlive()) {
            System.out.println("Выиграл " + maxail.getName());
        } else {
            System.out.println("Выиграл " + lion.getName());
        }
    }

    private static Accessories showAllAcessories() throws IOException {
        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int number = 1;
            for (String allArmor : accessoriesFactory.getAllAccessories()) {
                System.out.println(number++ + " " + allArmor);
            }
            String name = reader.readLine();
            return accessoriesFactory.getAccessoriesByName(name);

        }
    }

    private static Armor showAllArmor() throws IOException {
        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int number = 1;
            for (String allArmor : armorFactory.getAllArmors()) {
                System.out.println(number++ + " " + allArmor);
            }
            String name = reader.readLine();
            return armorFactory.getArmorByName(name);

        }
    }

    private static Person getSecondPerson() {
        Person lion = new Person("Lion");
        return lion;
    }

    private static Person getFirstPerson() {
        Person maxail = new Person("Mixail");
        maxail.setHp(50);
        return maxail;
    }

}