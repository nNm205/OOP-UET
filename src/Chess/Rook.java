package Chess;

public class Rook extends Piece {
    /**
     * Rook():
     * khoi tao co tham so.
     */

    public Rook(int coordinatesX, int coordinatesY) {
        super(coordinatesX, coordinatesY);
    }

    /**
     * Rook():
     * khoi tao co tham so.
     */

    public Rook(int coordinatesX, int coordinatesY, String color) {
        super(coordinatesX, coordinatesY, color);
    }

    /**
     * getSymbol():
     * get symbol.
     */

    public String getSymbol() {
        return "R";
    }

    /**
     * canMove():
     * can move.
     */

    public boolean canMove(Board board, int newX, int newY) {
        if (!board.validate(newX, newY)
                || (getCoordinatesX() != newX && getCoordinatesY() != newY)) {
            return false;
        } else {
            if (getCoordinatesY() == newY) {
                for (int curX = getCoordinatesX() + 1; curX < newX; curX++) {
                    if (board.getAt(curX, newY) != null) {
                        return false;
                    }
                }
            }

            if (getCoordinatesX() == newX) {
                for (int curY = getCoordinatesY() + 1; curY < newY; curY++) {
                    if (board.getAt(newX, curY) != null) {
                        System.out.println("There is a piece in same row");
                        return false;
                    }
                }
            }

            Piece curPiece = board.getAt(newX, newY);
            if (curPiece == null) {
                return true;
            }
            if (curPiece.getColor().equals(getColor())) {
                return false;
            }
            return true;
        }
    }
}
