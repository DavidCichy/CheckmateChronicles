import org.dc.cc.GameObjects.ChessPieces.*;
import org.dc.cc.GameObjects.Chessboard.Board;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestPiecesMovement {
    Board board = new Board();

    @Test
    @DisplayName("King on Blank Board - Correct Movement")
    public void testKingMovementBlankBoardCorrect(){
        IChessPiece piece = new King();

        Assertions.assertTrue(piece.isMoveValid(board.getField("A", "1"), board.getField("A", "2")));
        Assertions.assertTrue(piece.isMoveValid(board.getField("A", "2"), board.getField("A", "1")));
        Assertions.assertTrue(piece.isMoveValid(board.getField("B", "1"), board.getField("B", "2")));
        Assertions.assertTrue(piece.isMoveValid(board.getField("B", "2"), board.getField("B", "1")));

        Assertions.assertTrue(piece.isMoveValid(board.getField("A", "1"), board.getField("B", "2")));
        Assertions.assertTrue(piece.isMoveValid(board.getField("B", "2"), board.getField("A", "1")));
        Assertions.assertTrue(piece.isMoveValid(board.getField("B", "1"), board.getField("A", "2")));
        Assertions.assertTrue(piece.isMoveValid(board.getField("A", "2"), board.getField("B", "1")));
    }

    @Test
    @DisplayName("King on Blank Board - Incorrect Movement")
    public void testKingMovementBlankBoardIncorrect(){
        IChessPiece piece = new King();
        Assertions.assertFalse(piece.isMoveValid(board.getField("A","1"), board.getField("A", "3")));
        Assertions.assertFalse(piece.isMoveValid(board.getField("A","3"), board.getField("A", "1")));
        Assertions.assertFalse(piece.isMoveValid(board.getField("A","1"), board.getField("C", "1")));
        Assertions.assertFalse(piece.isMoveValid(board.getField("C","1"), board.getField("A", "1")));

        Assertions.assertFalse(piece.isMoveValid(board.getField("A","1"), board.getField("A", "8")));
        Assertions.assertFalse(piece.isMoveValid(board.getField("A","8"), board.getField("A", "1")));
        Assertions.assertFalse(piece.isMoveValid(board.getField("H","1"), board.getField("A", "1")));
        Assertions.assertFalse(piece.isMoveValid(board.getField("A","1"), board.getField("H", "1")));
    }



    @Test
    @DisplayName("Queen on Blank Board - Correct Movement - Horizontal and Vertical")
    public void testQueenMovementBlankBoardCorrect(){
        IChessPiece piece = new Queen();
        Assertions.assertTrue(piece.isMoveValid(board.getField("A","1"), board.getField("A", "2")));
        Assertions.assertTrue(piece.isMoveValid(board.getField("A","2"), board.getField("A", "1")));
        Assertions.assertTrue(piece.isMoveValid(board.getField("A","1"), board.getField("A", "3")));
        Assertions.assertTrue(piece.isMoveValid(board.getField("A","3"), board.getField("A", "1")));
        Assertions.assertTrue(piece.isMoveValid(board.getField("A","1"), board.getField("A", "8")));
        Assertions.assertTrue(piece.isMoveValid(board.getField("A","8"), board.getField("A", "1")));

        Assertions.assertTrue(piece.isMoveValid(board.getField("A","1"), board.getField("H", "1")));
        Assertions.assertTrue(piece.isMoveValid(board.getField("H","1"), board.getField("A", "1")));
    }
    @Test
    @DisplayName("Queen on Blank Board - Correct Movement - Diagonal")
    public void testQueenMovementBlankBoardCorrectDiagonal(){
        IChessPiece piece = new Queen();
        Assertions.assertTrue(piece.isMoveValid(board.getField("A1"), board.getField("c3")));
        Assertions.assertTrue(piece.isMoveValid(board.getField("c3"), board.getField("a1")));
        Assertions.assertTrue(piece.isMoveValid(board.getField("a1"), board.getField("h8")));
        Assertions.assertTrue(piece.isMoveValid(board.getField("h8"), board.getField("a1")));
        Assertions.assertTrue(piece.isMoveValid(board.getField("h1"), board.getField("a8")));
        Assertions.assertTrue(piece.isMoveValid(board.getField("a8"), board.getField("h1")));
    }
    @Test
    @DisplayName("Knight - Correct Movement")
    public void testKnightMovementCorrect(){
        IChessPiece piece = new Knight();

        Assertions.assertTrue(piece.isMoveValid(board.getField("A1"), board.getField("C2")));
        Assertions.assertTrue(piece.isMoveValid(board.getField("C2"), board.getField("A1")));
        Assertions.assertTrue(piece.isMoveValid(board.getField("A1"), board.getField("B3")));
        Assertions.assertTrue(piece.isMoveValid(board.getField("B3"), board.getField("A1")));

        Assertions.assertTrue(piece.isMoveValid(board.getField("D4"), board.getField("E6")));
        Assertions.assertTrue(piece.isMoveValid(board.getField("E6"), board.getField("D4")));
        Assertions.assertTrue(piece.isMoveValid(board.getField("E5"), board.getField("F3")));
        Assertions.assertTrue(piece.isMoveValid(board.getField("F3"), board.getField("E5")));
    }

    @Test
    @DisplayName("Knight - Incorrect Movement")
    public void testKnightMovementIncorrect(){
        IChessPiece piece = new Knight();

        Assertions.assertTrue(piece.isMoveValid(board.getField("A1"), board.getField("C1")));
        Assertions.assertTrue(piece.isMoveValid(board.getField("C1"), board.getField("A1")));
        Assertions.assertTrue(piece.isMoveValid(board.getField("A1"), board.getField("B2")));
        Assertions.assertTrue(piece.isMoveValid(board.getField("B2"), board.getField("A1")));

        Assertions.assertTrue(piece.isMoveValid(board.getField("D4"), board.getField("F6")));
        Assertions.assertTrue(piece.isMoveValid(board.getField("F6"), board.getField("D4")));

        Assertions.assertTrue(piece.isMoveValid(board.getField("G7"), board.getField("A8")));
        Assertions.assertTrue(piece.isMoveValid(board.getField("A1"), board.getField("H7")));
    }
}
