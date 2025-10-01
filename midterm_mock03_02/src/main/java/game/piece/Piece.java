package game.piece;

import game.board.Board;
import game.position.Position;
import game.util.Movement;

import java.util.Objects;
import java.util.Set;

public class Piece {
    protected boolean white;
    protected boolean moved;
    protected Position position;
    protected Board board;

    public Piece(boolean white, Position position, Board board) {
        this.white = white;
        this.position = position;
        this.board = board;
        this.board.placePiece(this, position);
    }

    public Set<Position> getLegalMove() {
        Movement a = new Movement(this.position,this.board);
        a.getMovePositions(this);
        return a.getMoves();
    }

    public Object deepCopy() {
        Piece p = new Piece(white,position,board);
        return p;
    }

    public String toString() {
        return this.getClass().getSimpleName()+"("+this.position+")";
    }

    public void moveHandle(Position to) {
        this.hadMoved();
        this.position = to;

    }

    public boolean hadMoved() {
        this.moved = true;
        return this.moved;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Piece piece = (Piece) o;
        return white == piece.white && moved == piece.moved && Objects.equals(position, piece.position) && Objects.equals(board, piece.board);
    }

    public boolean isWhite() {
        return white;
    }

    public void setWhite(boolean white) {
        this.white = white;
    }

    public boolean isMoved() {
        return moved;
    }

    public void setMoved(boolean moved) {
        this.moved = moved;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }
}
