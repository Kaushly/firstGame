package gamefight.character;

public class Drop {
    private long coin;
    private int xp;


    public Drop(long coin, int xp) {
        this.coin = coin;
        this.xp = xp;
    }

    public long getCoin() {
        return coin;
    }

    public void setCoin(long coin) {
        this.coin = coin;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    @Override
    public String toString() {
        return "Drop{" +
                "coin=" + coin +
                ", xp=" + xp +
                '}';
    }
}
