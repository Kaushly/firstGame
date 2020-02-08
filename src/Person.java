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
    private int defense;  // броня
    private int hp;
    private int strong;
    private int attack;
    private Weapon weapon;
    private Accessories accessories;
    private Armor armor;
    private DropStrong dropStrong;

    public Person(String name) {
        this.name = name;
        this.defense = 15;
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

    public int getFullDamage() {
        if (weapon == null) {
            return attack;
        }
        return attack + weapon.getDamage();
    }

    public int getFullHP() {
        if (accessories == null) {
            return hp;
        }
        return hp + accessories.getBonusHP();
    }

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

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
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



