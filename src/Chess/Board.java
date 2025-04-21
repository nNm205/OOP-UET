package Chess;

import java.util.ArrayList;

public class Board {
    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;
    private ArrayList<Piece> pieces = new ArrayList<>();

    /**
     * Board():
     * khoi tao ko tham so.
     */

    public Board() {

    }

    /**
     * addPiece():
     * add Piece.
     */

    public void addPiece(Piece newPiece) {
        if (!validate(newPiece.getCoordinatesX(), newPiece.getCoordinatesY())
            || newPiece == null) {
            return;
        }
        if (pieces.isEmpty()) {
            pieces.add(newPiece);
        } else {
            boolean isDuplicatePosition = true;
            for (Piece curPiece : pieces) {
                if (curPiece.checkPosition(newPiece)) {
                    isDuplicatePosition = false;
                    break;
                }
            }
            if (isDuplicatePosition == true) {
                pieces.add(newPiece);
            }
        }
    }

    /**
     * validate():
     * validate.
     */

    public boolean validate(int x, int y) {
        return (1 <= x && x <= WIDTH && 1 <= y && y <= HEIGHT);
    }

    /**
     * removeAt():
     * remove at.
     */

    public void removeAt(int x, int y) {
        pieces.removeIf(piece -> piece.getCoordinatesX() == x
                && piece.getCoordinatesY() == y);
    }

    /**
     * getAt():
     * get at.
     */

    public Piece getAt(int x, int y) {
        for (Piece piece : pieces) {
            if (piece.getCoordinatesX() == x
                    && piece.getCoordinatesY() == y) {
                return piece;
            }
        }
        return null;
    }

    /**
     * getPieces():
     * get pieces.
     */

    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    /**
     * setPieces():
     * set pieces.
     */

    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }
}
