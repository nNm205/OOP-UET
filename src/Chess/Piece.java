package Chess;

public abstract class Piece {
    private int coordinatesX;
    private int coordinatesY;
    private String color;

    /**
     * Piece():
     * khoi tao co tham so.
     */

    public Piece(int coordinatesX, int coordinatesY) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
        this.color = "white";
    }

    /**
     * Piece():
     * khoi tao co tham so.
     */

    public Piece(int coordinatesX, int coordinatesY, String color) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
        this.color = color;
    }

    /**
     * getSymbol():
     * get symbol.
     */

    public abstract String getSymbol();

    /**
     * canMove():
     * can move.
     */

    public abstract boolean canMove(Board board, int newX, int newY);

    /**
     * checkPosition():
     * check position.
     */

    public boolean checkPosition(Piece piece) {
        if (coordinatesX == piece.getCoordinatesX()
                && coordinatesY == piece.getCoordinatesY()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * getCoordinatesX():
     * get x.
     */

    public int getCoordinatesX() {
        return coordinatesX;
    }

    /**
     * setCoordinatesX():
     * set x.
     */

    public void setCoordinatesX(int coordinatesX) {
        this.coordinatesX = coordinatesX;
    }

    /**
     * getCoordinatesY():
     * get y.
     */

    public int getCoordinatesY() {
        return coordinatesY;
    }

    /**
     * setCoordinatesY():
     * set y.
     */

    public void setCoordinatesY(int coordinatesY) {
        this.coordinatesY = coordinatesY;
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

    public void setColor(String color) {
        this.color = color;
    }
}
