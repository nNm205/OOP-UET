public class Rectangle extends Shape {
    protected double width;
    protected double length;
    protected Point topLeft;

    /**
     * Rectangle():
     * khoi tao ko tham so.
     */

    public Rectangle() {}

    /**
     * Rectangle():
     * khoi tao co tham so.
     */

    public Rectangle(double width1, double length1) {
        width = width1;
        length = length1;
    }

    /**
     * Rectangle():
     * khoi tao co tham so.
     */

    public Rectangle(double width1, double length1, String color1, boolean filled1) {
        super(color1, filled1);
        width = width1;
        length = length1;
    }

    /**
     * Rectangle():
     * khoi tao co tham so.
     */

    public Rectangle(Point topLeft1, double width1, double length1, String color1, boolean filled1) {
        super(color1, filled1);
        topLeft = topLeft1;
        width = width1;
        length = length1;
    }

    /**
     * getTopLeft():
     * get top left point.
     */

    public Point getTopLeft() {
        return topLeft;
    }

    /**
     * setTopLeft():
     * set top left point.
     */

    public void setTopLeft(Point topLeft1) {
        topLeft = topLeft1;
    }

    /**
     * getWidth():
     * get width.
     */

    public double getWidth() {
        return width;
    }

    /**
     * setWidth():
     * set width.
     */

    public void setWidth(double width1) {
        this.width = width1;
    }

    /**
     * getLength():
     * get length.
     */

    public double getLength() {
        return length;
    }

    /**
     * setHeight():
     * set height.
     */

    public void setLength(double length1) {
        this.length = length1;
    }

    /**
     * getArea():
     * get area.
     */

    @Override
    public double getArea() {
        return width * length;
    }

    /**
     * getPerimeter():
     * get perimeter.
     */

    @Override
    public double getPerimeter() {
        return (width + length) * 2;
    }

    /**
     * toString():
     * to string.
     */

    public String toString() {
        return "Rectangle[topLeft=" + getTopLeft().toString()
                + ",width=" + width
                + ",length=" + length
                + ",color=" + color
                + ",filled=" + filled + "]";
    }


    /**
     * hashCode():
     * hash code.
     */

    public int hashCode() {
        return 3;
    }

    /**
     * equals():
     * equals.
     */

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        Rectangle obj = (Rectangle) o;
        return obj.getTopLeft().equals(topLeft)
                && obj.getWidth() == width
                && obj.getLength() == length;
    }
}
