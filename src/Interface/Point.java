public class Point {
    private double pointX;
    private double pointY;

    /**
     * Point():
     * khoi tao co tham so.
     */

    public Point(double x, double y) {
        pointX = x;
        pointY = y;
    }

    /**
     * getPointX():
     * get x.
     */

    public double getPointX() {
        return pointX;
    }

    /**
     * setPointX():
     * set x.
     */

    public void setPointX(double x) {
        pointX = x;
    }

    /**
     * getPointY():
     * get y.
     */

    public double getPointY() {
        return pointY;
    }

    /**
     * setPointY():
     * set y.
     */

    public void setPointY(double y) {
        pointY = y;
    }

    /**
     * distance():
     * get distance.
     */

    public double distance(Point point) {
        return Math.sqrt((pointX - point.getPointX()) * (pointX - point.getPointX())
                + (pointY - point.getPointY()) * (pointY - point.getPointY()));
    }
}
