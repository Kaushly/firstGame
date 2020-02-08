public class DropArmor {

    private String DropName;
    private int weight;
    private int bonusArmor;

    public DropArmor(String DropName, int weight, int bonusArmor){
        this.DropName = DropName;
        this.weight = weight;
        this.bonusArmor = bonusArmor;
    }

    public String getDropName() {
        return DropName;
    }

    public void setDropName(String dropName) {
        DropName = dropName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getBonusArmor() {
        return bonusArmor;
    }

    public void setBonusArmor(int bonusArmor) {
        this.bonusArmor = bonusArmor;
    }
}
