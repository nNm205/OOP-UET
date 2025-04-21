import java.util.ArrayList;

public class Layer {
    private ArrayList<Shape> shapes;

    /**
     * addShape():
     * add shape.
     */

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    /**
     * removeCircles():
     * remove circles.
     */

    public void removeCircles() {
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                shapes.remove(shape);
            }
        }
    }

    /**
     * getInfo():
     * get info.
     */

    public String getInfo() {
        StringBuilder result = new StringBuilder("Layer of crazy shapes\n");
        for (Shape shape : shapes) {
            result.append(shape.toString());
            result.append("\n");
        }
        return result.toString();
    }

    /**
     * removeDuplicates():
     * remove duplicates.
     */

    public void removeDuplicates() {
        if (!shapes.isEmpty()) {
            for (int i = 0; i < shapes.size(); i++) {
                if (shapes.get(i) == null) {
                } else {
                    if (shapes.get(i) instanceof Circle) {
                        Circle currentCircle = (Circle) shapes.get(i);
                        for (int j = shapes.size() - 1; j > i; j--) {
                            if (shapes.get(j) == null) {
                                continue;
                            } else {
                                if (currentCircle.equals(shapes.get(j))) {
                                    shapes.remove(j);
                                }
                            }
                        }
                    } else if (shapes.get(i) instanceof Rectangle) {
                        Rectangle currentRectangle = (Rectangle) shapes.get(i);
                        for (int j = shapes.size() - 1; j > i; j--) {
                            if (shapes.get(j) == null) {
                                continue;
                            } else {
                                if (currentRectangle.equals(shapes.get(j))) {
                                    shapes.remove(j);
                                }
                            }
                        }
                    } else {
                        Square currentSquare = (Square) shapes.get(i);
                        for (int j = shapes.size() - 1; j > i; j--) {
                            if (shapes.get(j) == null) {
                                continue;
                            } else {
                                if (currentSquare.equals(shapes.get(j))) {
                                    shapes.remove(j);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
