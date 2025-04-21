public class Square extends Rectangle {
    /**
     * Square():
     * khoi tao ko tham so.
     */

    public Square() {}

    /**
     * Square():
     * khoi tao co tham so.
     */

    public Square(double side) {
        super(side, side);
    }

    /**
     * Square():
     * khoi tao co tham so.
     */

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    /**
     * Square():
     * khoi tao co tham so.
     */

    public Square(Point topLeft, double side, String color, boolean filled) {
        super(topLeft, side, side, color, filled);
    }

    /**
     * getSide():
     * get side.
     */

    public double getSide() {
        return getWidth();
    }

    /**
     * setWidth():
     * set width.
     */

    @Override
    public void setWidth(double side) {
        setWidth(side);
    }

    /**
     * setLength():
     * set length.
     */

    @Override
    public void setLength(double side) {
        setLength(side);
    }

    /**
     * setSide():
     * set side.
     */

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    /**
     * getArea():
     * get area.
     */

    @Override
    public double getArea() {
        return getWidth() * getLength();
    }

    /**
     * getPerimeter():
     * get perimeter.
     */

    @Override
    public double getPerimeter() {
        return getWidth() * 4;
    }

    /**
     * toString():
     * to string.
     */

    public String toString() {
        return "Square[topLeft=" + getTopLeft().toString()
                + ",side=" + getSide()
                + ",color=" + getColor()
                + ",filled=" + isFilled() + "]";
    }

    /**
     * hashCode():
     * hash code.
     */

    public int hashCode() {
        return 2;
    }

    /**
     * equals():
     * equals.
     */

    public boolean equals(Object o) {
        if (this == o) return false;
        if (!(o instanceof Square)) return false;
        Square obj = (Square) o;
        return getTopLeft() == obj.getTopLeft()
                && getSide() == obj.getSide();
    }
}
