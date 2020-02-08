public class DropHP {
//fn+shift+f6
    private String dropName;
    private int bonusHP;
    private double weight;
//    private int bonusStrong;
//    private int bonusArmorr;

    public DropHP(String dropName, double weight, int bonusHP){
        this.dropName = dropName;
        this.weight = weight;
        this.bonusHP = bonusHP;
    }

    public String getDropName() {
        return dropName;
    }

    public void setDropName(String dropName) {
        this.dropName = dropName;
    }

    public int getBonusHP() {
        return bonusHP;
    }

    public void setBonusHP(int bonusHP) {
        this.bonusHP = bonusHP;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
