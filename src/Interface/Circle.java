public class Circle extends Shape {
    private final double pi = 3.14;
    protected double radius;
    protected Point center;

    /**
     * Circle():
     * khoi tao co tham so.
     */

    public Circle(double radius1, Point center1) {
        center = center1;
        radius = radius1;
    }

    /**
     * getCenter():
     * get center point.
     */

    public Point getCenter() {
        return center;
    }

    /**
     * setCenter():
     * set center.
     */

    public void setCenter(Point center1) {
        center = center1;
    }

    /**
     * getRadius():
     * get radius.
     */

    public double getRadius() {
        return radius;
    }

    /**
     * setRadius():
     * set radius.
     */

    public void setRadius(double radius1) {
        radius = radius1;
    }

    /**
     * getArea():
     * get area.
     */

    @Override
    public double getArea() {
        return pi * radius * radius;
    }

    /**
     * getPerimeter():
     * get perimeter.
     */

    @Override
    public double getPerimeter() {
        return 2.0 * pi * radius;
    }

    /**
     * toString():
     * to string.
     */

    public String getInfo() {
        return "Circle[(" + String.format("%.2f", center.getPointX())
                + "," + String.format("%.2f", center.getPointY())
                + "),r=" + String.format("%.2f", radius)
                + "]";
    }
}
