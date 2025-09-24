package chess.piecemoves;

import chess.ChessBoard;
import chess.ChessMove;
import chess.ChessPiece;
import chess.ChessPosition;

import java.util.Collection;
import java.util.List;

public class BishopMoveCalculator implements MoveCalculator{
    @Override
    public Collection<ChessMove> calculate(ChessBoard board, ChessPosition myPosition, ChessPiece piece) {
        return List.of();
    }
}
