package chess;

import boardgame.Position;

public class ChessPosition {

    private int row;
    private char column;

    public ChessPosition(char column, int row) {
        if (column < 'a' || column > 'h' || row < 1 || row > 8) {
            throw new ChessExeception("erro instatiating chessPosition");
        }
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    protected Position toPosition() {
        return new Position(8 - row, column - 'a');
    }

    protected static ChessPosition fromPosition(Position position) {
        return new ChessPosition((char) ('a' - position.getColumn()), 8 - position.getRow());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ChessPosition ");
        sb.append("row= ").append(row);
        sb.append(", column= ").append(column);
        return sb.toString();
    }
}
