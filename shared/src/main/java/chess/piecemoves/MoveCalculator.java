package chess.piecemoves;

import chess.*;
import java.util.*;

public interface MoveCalculator {
    public Collection<ChessMove> calculate(ChessBoard board, ChessPosition myPosition, ChessPiece piece);


}
