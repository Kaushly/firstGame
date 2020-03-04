//todo создать класс Weapon параметры сила урона, цвет, вес, тип оружия , прочность
// и добавь возможность персонажу установить оружие
//todo создай с 4 параметрами и 3 метода получение урона, вывести информацию о параметрах
public class Enemy {
    //модификаторы доступа private, protected , default ,public
    private String name;
    private int defense;  // броня
    private int hp;
    private int strong;
    private int attack;
    private Weapon weapon;
    private Accessories accessories;
    private Armor armor;
    private DropStrong dropStrong;

    public Enemy(String name) {
        this.name = name;
        this.defense = 30;
        this.hp = 90;
        this.strong = 20;
        this.attack = 5;

    }

    public int getFullDamage() {
        if (weapon == null) {
            return attack;
        }
        return attack + weapon.getDamage();
    }

//    public int getFullHP() {
//        if (accessories == null) {
//            return hp;
//        }
//        return hp + accessories.getBonusHP();
//    }

    public int getFullArmor() {
        if (armor == null || armor.getEffect() == null) {
            return defense;
        }
        for (Effect effect : armor.getEffect()) {
            if (EffectType.DEFFENCE.equals(effect.getType())) {
                return defense + effect.getValue();
            }
        }
        return defense;
    }

    public int getFullStrong() {
        if (dropStrong == null) {
            return strong;
        }
        return strong + dropStrong.getBonusStrong();
    }


    @Override
    public String toString() {
        return "Person" +
                "\n name: '" + name + '\'' +
                ", \n armor: " + getFullArmor() +
//                ", \n hp: " + getFullHP() +
                ", \n strong: " + getFullStrong() +
                ", \n attack: " + getFullDamage() +
                ", \n weapon: " + weapon;
    }

    //    public int fight(Weapon anotherWeapon) {
//        if (this.strong >= anotherWeapon.getStrength()) {
//            this.attack = this.strong + anotherWeapon.getDamage();
//        } else this.attack = this.strong;
//        return attack;
//    }
    public int getStrong() {
        return strong;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefenseint(int defense) {
        this.defense = defense;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setStrong(int strong) {
        this.strong = strong;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Accessories getAccessories() {
        return accessories;
    }

    public void setAccessories(Accessories accessories) {
        this.accessories = accessories;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public DropStrong getDropStrong() {
        return dropStrong;
    }

    public void setDropStrong(DropStrong dropStrong) {
        this.dropStrong = dropStrong;
    }


}
