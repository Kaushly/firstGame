package gamefight.character;

public class Drop {
    private long coin;
    private int experience;


    public Drop(long coin, int experience) {
        this.coin = coin;
        this.experience = experience;
    }

    public long getCoin() {
        return coin;
    }

    public void setCoin(long coin) {
        this.coin = coin;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Drop{" +
                "coin=" + coin +
                ", xp=" + experience +
                '}';
    }
}
