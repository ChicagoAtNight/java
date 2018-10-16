public class Point2D {
    public int x;
    public int y;

    public Point2D (int x, int y) {
        move(x,y);
    }

    public Point2D() {}

    public Point2D(Point2D other){
        move(other.x,other.y);
    }

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void translate(int dx, int dy){
        move(x + dx, y + dy);
    }

    public double distanceTo(Point2D other){
        int dx = other.x - this.x;
        int dy = other.y - this.y;
        dx *= dx;
        dy *= dy;
        return Math.sqrt(dx + dy);
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", this.x, this.y);
    }

}