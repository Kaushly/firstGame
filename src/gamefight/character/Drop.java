package gamefight.character;

public class Drop {
    private long coin;

    public Drop(long coin) {
        this.coin = coin;
    }

    public long getCoin() {
        return coin;
    }

    public void setCoin(long coin) {
        this.coin = coin;
    }

    @Override
    public String toString() {
        return "Drop{" +
                "coin=" + coin +
                '}';
    }
}
