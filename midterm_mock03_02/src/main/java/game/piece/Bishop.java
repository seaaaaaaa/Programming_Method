package game.piece;

import game.board.Board;
import game.position.Position;

public class Bishop extends Piece {
    public Bishop(boolean white, Position position, Board board) {
        super(white, position, board);
    }

    public Object deepCopy() {
        Bishop copy = new Bishop(white, position, board);
        copy.moved = this.moved;
        return copy;
    }
}
