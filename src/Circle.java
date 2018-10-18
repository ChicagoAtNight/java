public class Circle extends Point2D {
    private int radius = 1;

    public Circle(int x, int y, int r) {
        super(x,y);
        setRadius(r);
    }

    public Circle(Circle other) {
        this(other.x, other.y, other.radius);
    }

    public Circle() {}

    public int getRadius() {
        return radius;
    }

    public void setRadius(int r) {
        this.radious = r > 0 ? r : -r;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return String.format("Circle[%s:%d",super().toString(),radius);
    }

}