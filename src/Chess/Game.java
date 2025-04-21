package Chess;

import java.util.ArrayList;

public class Game {
    private Board board;
    private ArrayList<Move> moveHistory = new ArrayList<>();

    /**
     * Game():
     * khoi tao co tham so.
     */

    public Game(Board board) {
        this.board = board;
    }

    /**
     * movePiece():
     * move piece.
     */

    public void movePiece(Piece piece, int x, int y) {
        if (piece.canMove(board, x, y)) {
            Piece curPiece = board.getAt(x, y);
            board.removeAt(piece.getCoordinatesX(), piece.getCoordinatesY());
            Move newMove = new Move(piece.getCoordinatesX(),
                    x, piece.getCoordinatesY(), y, piece);
            if (curPiece != null) {
                newMove.setKilledPiece(board.getAt(x, y));
                board.removeAt(x, y);
            }
            piece.setCoordinatesX(x);
            piece.setCoordinatesY(y);
            board.addPiece(piece);
            moveHistory.add(newMove);
        }
    }

    /**
     * getBoard():
     * get board.
     */

    public Board getBoard() {
        return board;
    }

    /**
     * setBoard():
     * set board.
     */

    public void setBoard(Board board) {
        this.board = board;
    }

    /**
     * getMoveHistory():
     * get moveHistory.
     */

    public ArrayList<Move> getMoveHistory() {
        return moveHistory;
    }

    public static void main(String[] args) {
        Board board = new Board();
        Game game = new Game(board);
        Bishop bs1 = new Bishop(4, 2, "white");
        Bishop bs2 = new Bishop(3, 3, "black");
        Bishop bs3 = new Bishop(7, 5, "white");
        board.addPiece(bs1);
        board.addPiece(bs2);
        board.addPiece(bs3);
        System.out.println("Before moving: ");
        for(Piece piece : board.getPieces()) {
            System.out.println(piece.getSymbol() + " " + piece.getCoordinatesX() + " " + piece.getCoordinatesY() + " " + piece.getColor());
        }
        game.movePiece(bs1, 6, 4);
        game.movePiece(bs2, 5, 1);
        game.movePiece(bs3, 9, 7);
        for (Move move : game.getMoveHistory()) {
            System.out.println(move.toString());
        }
        System.out.println("After moving: ");
        for(Piece piece : board.getPieces()) {
            System.out.println(piece.getSymbol() + " " + piece.getCoordinatesX() + " " + piece.getCoordinatesY() + " " + piece.getColor());
        }
    }
}
  