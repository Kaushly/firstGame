//todo создать класс Weapon параметры сила урона, цвет, вес, тип оружия , прочность
// и добавь возможность персонажу установить оружие
//todo создай с 4 параметрами и 3 метода получение урона, вывести информацию о параметрах
public class Enemy {
    //модификаторы доступа private, protected , default ,public
    private String name;
    private int armor;  // броня
    private int hp;
    private int strong;
    private int attack;
    private Weapon weapon;
    private DropHP dropHP;
    private DropArmor dropArmor;
    private DropStrong dropStrong;

    public Enemy(String name, int armor, int hp, int strong) {
        this.name = name;
        this.armor = armor;
        this.hp = hp;
        this.strong = strong;
        this.attack = 5;

    }

    public int getFullDamage(){
        if (weapon == null){
            return attack;
        }
        return attack + weapon.getDamage();
    }

    public int getFullHP(){
        if (dropHP == null){
            return hp;
        }
        return hp + dropHP.getBonusHP();
    }

    public int getFullArmor(){
        if (dropArmor == null){
            return armor;
        }
        return armor + dropArmor.getBonusArmor();
    }

    public int getFullStrong(){
        if (dropStrong == null){
            return strong;
        }
        return strong + dropStrong.getBonusStrong();
    }


    @Override
    public String toString() {
        return "Person" +
                "\n name: '" + name + '\'' +
                ", \n armor: " + getFullArmor() +
                ", \n hp: " + getFullHP() +
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

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
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

    public DropHP getDropHP() {
        return dropHP;
    }

    public void setDropHP(DropHP dropHP) {
        this.dropHP = dropHP;
    }

    public DropArmor getDropArmor() {
        return dropArmor;
    }

    public void setDropArmor(DropArmor dropArmor) {
        this.dropArmor = dropArmor;
    }

    public DropStrong getDropStrong() {
        return dropStrong;
    }

    public void setDropStrong(DropStrong dropStrong) {
        this.dropStrong = dropStrong;
    }


}
