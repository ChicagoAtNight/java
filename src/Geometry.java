public class Geometry {
    public static void main(string[] args) {
        Point2D p;
        Point2D q;

        p = new Point2D(-7, 4);
        q = new Point2D(0, p.x);
        Point2D r = new Point2D();

        p.move(-p.x,p.y * 2);
        r.move(q.x,q.y);
        System.out.println(r);

        r.translate(3, -3);
        System.out.println(r);

        Point2D s = new Point2D(r);

        System.out.println(p);
        System.out.println(q);
        System.out.println(r);

        double distanceFromPtoQ = p.distanceTo(q);
        double distanceFromQtoP = q.distanceTo(p);
        system.out.printf("p to q: %f, q to p: %f \n")


    }
}
