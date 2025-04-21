public abstract class Shape {
    protected String color;
    protected boolean filled;

    /**
     * Shape():
     * khoi tao ko tham so.
     */

    public Shape() {}

    /**
     * Shape():
     * khoi tao co tham so.
     */

    public Shape(String color1, boolean filled1) {
        this.color = color1;
        this.filled = filled1;
    }

    /**
     * getColor():
     * get color.
     */

    public String getColor() {
        return color;
    }

    /**
     * setColor():
     * set color.
     */

    public void setColor(String color1) {
        this.color = color1;
    }

    /**
     * isFilled():
     * is filled.
     */

    public boolean isFilled() {
        return filled;
    }

    /**
     * setFilled():
     * set filled.
     */

    public void setFilled(boolean filled1) {
        this.filled = filled1;
    }

    /**
     * getArea():
     * get area.
     */

    public abstract double getArea();

    /**
     * getPerimeter():
     * get perimeter.
     */

    public abstract double getPerimeter();

    /**
     * toString():
     * to string.
     */

    @Override
    public String toString() {
        return "Shape[color=" + color + ",filled=" + filled + "]";
    }
}
