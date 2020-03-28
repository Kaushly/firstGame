package gamefight.field;

public class Coordinate {
    private Integer x;
    private Integer y;
    private Integer prevX;
    private Integer prevY;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
        prevY = y;
        prevX = x;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getPrevX() {
        return prevX;
    }

    public Integer getPrevY() {
        return prevY;
    }

    public void up() {
        prevY = y--;
    }

    public void down() {
        prevY = y++;
    }

    public void left() {
        prevX = x--;
    }

    public void right() {
        prevX = x++;
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public void clearCoordinate() {
        x = prevX;
        y = prevY;
    }
}
