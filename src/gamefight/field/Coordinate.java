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


    public void up() {
        prevX = y--;
    }

    public void down() {
        prevX = y++;
    }

    public void left() {
        prevY = x--;
    }

    public void right() {
        prevY = x++;
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
