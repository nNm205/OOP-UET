package Chess;

public class Move {
    private int startX;
    private int endX;
    private int startY;
    private int endY;
    private Piece movedPiece;
    private Piece killedPiece;

    /**
     * Move():
     * khoi tao co tham so.
     */

    public Move(int startX, int endX, int startY, int endY,
                Piece movedPiece) {
        this.startX = startX;
        this.endX = endX;
        this.startY = startY;
        this.endY = endY;
        this.movedPiece = movedPiece;
        this.killedPiece = null;
    }

    /**
     * Move():
     * khoi tao co tham so.
     */

    public Move(int startX, int endX, int startY, int endY,
                Piece movedPiece, Piece killedPiece) {
        this.startX = startX;
        this.endX = endX;
        this.startY = startY;
        this.endY = endY;
        this.movedPiece = movedPiece;
        this.killedPiece = killedPiece;
    }

    /**
     * toString():
     * to string.
     */

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(movedPiece.getColor()).append("-");
        result.append(movedPiece.getSymbol());
        result.append((char) (endX + 96)).append(endY);
        return result.toString();
    }

    /**
     * getStartX():
     * get x.
     */

    public int getStartX() {
        return startX;
    }

    /**
     * setStartX():
     * set x.
     */

    public void setStartX(int startX) {
        this.startX = startX;
    }

    /**
     * getEndX():
     * get x.
     */

    public int getEndX() {
        return endX;
    }

    /**
     * setEndX():
     * set x.
     */

    public void setEndX(int endX) {
        this.endX = endX;
    }

    /**
     * getStartY():
     * get y.
     */

    public int getStartY() {
        return startY;
    }

    /**
     * setStartY():
     * set y.
     */

    public void setStartY(int startY) {
        this.startY = startY;
    }

    /**
     * getEndY():
     * get y.
     */

    public int getEndY() {
        return endY;
    }

    /**
     * setEndY():
     * set y.
     */

    public void setEndY(int endY) {
        this.endY = endY;
    }

    /**
     * getMovedPiece():
     * get moved piece.
     */

    public Piece getMovedPiece() {
        return movedPiece;
    }

    /**
     * setMovedPiece():
     * set moved piece.
     */

    public void setMovedPiece(Piece movedPiece) {
        this.movedPiece = movedPiece;
    }

    /**
     * getKilledPiece():
     * get killed piece.
     */

    public Piece getKilledPiece() {
        return killedPiece;
    }

    /**
     * setKilledPiece():
     * set killed piece.
     */

    public void setKilledPiece(Piece killedPiece) {
        this.killedPiece = killedPiece;
    }
}
