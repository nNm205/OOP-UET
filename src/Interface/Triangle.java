public class Triangle implements GeometricObject {
    private Point p1;
    private Point p2;
    private Point p3;

    /**
     * Triangle():
     * khoi tao co tham so.
     */

    public Triangle(Point p1, Point p2, Point p3) throws RuntimeException {
        if (p1.distance(p2) == 0 || p1.distance(p3) == 0
                || p2.distance(p3) == 0) {
            throw new RuntimeException();
        } else if (p1.getPointX() == p2.getPointX() && p1.getPointX() == p3.getPointX()) {
            throw new RuntimeException();
        } else if (p1.getPointY() == p2.getPointY() && p1.getPointY() == p3.getPointY()) {
            throw new RuntimeException();
        } else {
            this.p1 = p1;
            this.p2 = p2;
            this.p3 = p3;
        }
    }

    /**
     * getP1():
     * get p1.
     */

    public Point getP1() {
        return p1;
    }

    /**
     * getP2():
     * get p2.
     */

    public Point getP2() {
        return p2;
    }

    /**
     * getP3():
     * get p3.
     */

    public Point getP3() {
        return p3;
    }

    /**
     * getArea():
     * get area.
     */

    @Override
    public double getArea() {
        double a = p1.distance(p2);
        double b = p2.distance(p3);
        double c = p3.distance(p1);
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    /**
     * getPerimeter():
     * get perimeter.
     */

    @Override
    public double getPerimeter() {
        double a = p1.distance(p2);
        double b = p2.distance(p3);
        double c = p3.distance(p1);
        return (a + b + c);
    }

    @Override
    public String getInfo() {
        return "Triangle[("
                + String.format("%.2f", p1.getPointX())
                + "," + String.format("%.2f", p1.getPointY())
                + "),(" + String.format("%.2f", p2.getPointX())
                + "," + String.format("%.2f", p2.getPointY())
                + "),(" + String.format("%.2f", p3.getPointX())
                + "," + String.format("%.2f", p3.getPointY())
                + ")]";
    }
}
