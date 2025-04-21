package Chess;

public class Bishop extends Piece {
    /**
     * Bishop():
     * khoi tao co tham so.
     */

    public Bishop(int coordinatesX, int coordinatesY) {
        super(coordinatesX, coordinatesY);
    }

    /**
     * Bishop():
     * khoi tao co tham so.
     */

    public Bishop(int coordinatesX, int coordinatesY, String color) {
        super(coordinatesX, coordinatesY, color);
    }

    /**
     * getSymbol():
     * get symbol.
     */

    @Override
    public String getSymbol() {
        return "B";
    }

    /**
     * canMove():
     * can move.
     */

    @Override
    public boolean canMove(Board board, int newX, int newY) {
        if (!board.validate(newX, newY)) {
            return false;
        }
        if (Math.abs(getCoordinatesX() - newX) != Math.abs(getCoordinatesY() - newY)) {
            return false;
        }
        int dx = 0;
        int dy = 0;
        if (getCoordinatesX() < newX) {
            dx = 1;
        } else {
            dx = -1;
        }
        if (getCoordinatesY() < newY) {
            dy = 1;
        } else {
            dy = -1;
        }
        int curX = getCoordinatesX() + dx;
        int curY = getCoordinatesY() + dy;
        while (curX != newX && curY != newY) {
            if (!board.validate(curX, curY)
                    || board.getAt(curX, curY) != null) {
                return false;
            }
            curX += dx;
            curY += dy;
        }
        Piece curPiece = board.getAt(curX, curY);
        if (curPiece != null) {
            if (curPiece.getColor().equals(getColor())) {
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }
}
