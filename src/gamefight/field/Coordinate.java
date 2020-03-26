package gamefight.field;

public class Coordinate {
    private Integer x;
    private Integer y;
    private Integer prevX;
    private Integer prevY;

    public Coordinate() {
        x = 0;
        y = 0;
        prevY = 0;
        prevX = 0;
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
// todo: Исправил перемещение героя по карте
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
