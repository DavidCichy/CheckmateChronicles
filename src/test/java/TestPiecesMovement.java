import org.dc.cc.GameObjects.ChessPieces.King;
import org.dc.cc.GameObjects.ChessPieces.Queen;
import org.dc.cc.GameObjects.Chessboard.Board;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestPiecesMovement {
    Board board = new Board();

    @Test
    @DisplayName("King on Blank Board - Correct Movement")
    public void testKingMovementBlankBoardCorrect(){
        King king = new King();

        Assertions.assertTrue(king.isMoveValid(board.getField("A", "1"), board.getField("A", "2")));
        Assertions.assertTrue(king.isMoveValid(board.getField("A", "2"), board.getField("A", "1")));
        Assertions.assertTrue(king.isMoveValid(board.getField("B", "1"), board.getField("B", "2")));
        Assertions.assertTrue(king.isMoveValid(board.getField("B", "2"), board.getField("B", "1")));

        Assertions.assertTrue(king.isMoveValid(board.getField("A", "1"), board.getField("B", "2")));
        Assertions.assertTrue(king.isMoveValid(board.getField("B", "2"), board.getField("A", "1")));
        Assertions.assertTrue(king.isMoveValid(board.getField("B", "1"), board.getField("A", "2")));
        Assertions.assertTrue(king.isMoveValid(board.getField("A", "2"), board.getField("B", "1")));
    }

    @Test
    @DisplayName("King on Blank Board - Incorrect Movement")
    public void testKingMovementBlankBoardIncorrect(){
        King king = new King();
        Assertions.assertFalse(king.isMoveValid(board.getField("A","1"), board.getField("A", "3")));
        Assertions.assertFalse(king.isMoveValid(board.getField("A","3"), board.getField("A", "1")));
        Assertions.assertFalse(king.isMoveValid(board.getField("A","1"), board.getField("C", "1")));
        Assertions.assertFalse(king.isMoveValid(board.getField("C","1"), board.getField("A", "1")));

        Assertions.assertFalse(king.isMoveValid(board.getField("A","1"), board.getField("A", "8")));
        Assertions.assertFalse(king.isMoveValid(board.getField("A","8"), board.getField("A", "1")));
        Assertions.assertFalse(king.isMoveValid(board.getField("H","1"), board.getField("A", "1")));
        Assertions.assertFalse(king.isMoveValid(board.getField("A","1"), board.getField("H", "1")));
    }

}
