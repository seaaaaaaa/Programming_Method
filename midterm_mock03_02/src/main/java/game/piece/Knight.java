package game.piece;

import game.board.Board;
import game.position.Position;

public class Knight extends Piece {
    public Knight(boolean white, Position position, Board board) {
        super(white, position, board);
    }

    public Object deepCopy() {
        Knight copy = new Knight(white, position, board);
        copy.moved = this.moved;
        return copy;
    }
}
