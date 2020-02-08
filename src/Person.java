import java.util.Objects;

public class Person {
//    String priv = new priv();
//    System.out.println("привет");

//    private int hp;
//    private int damage;
//    private String name;
//    private Weapon weapon;
//    private int minStengh;
//
//    public Person(String name) {
//        this.name = name;
//        damage = 8;
//        hp = 150;
//        minStengh = 18;
//    }
//
//    public Person(int hp, int damage, String name) {
//        this.hp = hp;
//        this.damage = damage;
//        this.name = name;
//    }
//
//    @Override
//    public String toString() {
//        return "Person " +
//                "\n hp=" + hp +
//                ",\n damage=" + damage +
//                ",\n name='" + name + '\'' +
//                ",\n weapon=" + weapon;
//    }

    private String name;
    private int armor;  // броня
    private int hp;
    private int strong;
    private int attack;
    private Weapon weapon;
    private DropHP dropHP;
    private DropArmor dropArmor;
    private DropStrong dropStrong;

    public Person(String name) {
        this.name = name;
        this.armor = 15;
        this.hp = 100;
        this.strong = 20;
        this.attack = 5;
    }


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Person person = (Person) o;
//        return hp == person.hp &&
//                damage == person.damage &&
//                Objects.equals(name, person.name) &&
//                Objects.equals(weapon, person.weapon);
//    }

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

    public int getStrong() {
        return strong;
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



