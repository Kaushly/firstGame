public class Weapon {//POJO class

    private String DropName;
    private int damage;
    private int weight;
    private String type;
    private int strength;

    public Weapon(String DropName, int damage, int weight, String type, int strength){
        this.DropName = DropName;
        this.damage = damage;
        this.weight = weight;
        this.type = type;
        this.strength = strength;
    }

    @Override
    public String toString() {
        return
                " title = '" + DropName + '\'' +
                ", damage = " + damage +
                ", weight = " + weight +
                ", type = '" + type + '\'' +
                ", strength = " + strength;
    }

    public void info() {
        System.out.println("Назвние: " + DropName + "\nУрон: " + damage + "\nВес:" +
                " " + weight + "\nТип: " + type + "\nСила: " + strength + "\n");
    }

    public String getTitle() {
        return DropName;
    }

    public void setTitle(String DropName) {
        this.DropName = DropName;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}//todo  contrl +Enter

