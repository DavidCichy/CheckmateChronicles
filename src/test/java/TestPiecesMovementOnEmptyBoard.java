import org.dc.cc.GameObjects.ChessPieces.*;
import org.dc.cc.GameObjects.Chessboard.Board;
import org.dc.cc.GameObjects.Players.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class TestPiecesMovementOnEmptyBoard {
    Board board = new Board();

    @Test
    @Order(1)
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
    @Order(2)
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
    @Order(3)
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
    @Order(4)
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
    @Order(5)
    @DisplayName("Knight - Correct Movement")
    public void testQueenMovementIncorrect(){
        IChessPiece piece = new Queen();

        Assertions.assertFalse(piece.isMoveValid(board.getField("A1"), board.getField("C2")));
        Assertions.assertFalse(piece.isMoveValid(board.getField("C2"), board.getField("A1")));
        Assertions.assertFalse(piece.isMoveValid(board.getField("A1"), board.getField("B3")));
        Assertions.assertFalse(piece.isMoveValid(board.getField("B3"), board.getField("A1")));

        Assertions.assertFalse(piece.isMoveValid(board.getField("D4"), board.getField("E6")));
        Assertions.assertFalse(piece.isMoveValid(board.getField("E6"), board.getField("D4")));
        Assertions.assertFalse(piece.isMoveValid(board.getField("E5"), board.getField("F3")));
        Assertions.assertFalse(piece.isMoveValid(board.getField("F3"), board.getField("E5")));
    }
    @Test
    @Order(8)
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
    @Order(9)
    @DisplayName("Knight - Incorrect Movement")
    public void testKnightMovementIncorrect(){
        IChessPiece piece = new Knight();

        Assertions.assertFalse(piece.isMoveValid(board.getField("A1"), board.getField("C1")));
        Assertions.assertFalse(piece.isMoveValid(board.getField("C1"), board.getField("A1")));
        Assertions.assertFalse(piece.isMoveValid(board.getField("A1"), board.getField("B2")));
        Assertions.assertFalse(piece.isMoveValid(board.getField("B2"), board.getField("A1")));

        Assertions.assertFalse(piece.isMoveValid(board.getField("D4"), board.getField("F6")));
        Assertions.assertFalse(piece.isMoveValid(board.getField("F6"), board.getField("D4")));

        Assertions.assertFalse(piece.isMoveValid(board.getField("G7"), board.getField("A8")));
        Assertions.assertFalse(piece.isMoveValid(board.getField("A1"), board.getField("H7")));
    }
    @Test
    @Order(6)
    @DisplayName("Bishop on Blank Board - Correct Movement")
    public void testBishopMovementBlankBoardCorrect(){
        IChessPiece piece = new Bishop();
        Assertions.assertTrue(piece.isMoveValid(board.getField("A1"), board.getField("C3")));
        Assertions.assertTrue(piece.isMoveValid(board.getField("C3"), board.getField("A1")));
        Assertions.assertTrue(piece.isMoveValid(board.getField("A1"), board.getField("H8")));
        Assertions.assertTrue(piece.isMoveValid(board.getField("H8"), board.getField("A1")));
        Assertions.assertTrue(piece.isMoveValid(board.getField("H1"), board.getField("A8")));
        Assertions.assertTrue(piece.isMoveValid(board.getField("A8"), board.getField("H1")));
    }
    @Test
    @Order(7)
    @DisplayName("Bishop on Blank Board - Incorrect Movement")
    public void testBishopMovementBlankBoardIncorrect(){
        IChessPiece piece = new Bishop();
        Assertions.assertFalse(piece.isMoveValid(board.getField("A1"), board.getField("B3")));
        Assertions.assertFalse(piece.isMoveValid(board.getField("B3"), board.getField("A1")));
        Assertions.assertFalse(piece.isMoveValid(board.getField("A1"), board.getField("H7")));
        Assertions.assertFalse(piece.isMoveValid(board.getField("H7"), board.getField("A1")));
        Assertions.assertFalse(piece.isMoveValid(board.getField("H1"), board.getField("H2")));
        Assertions.assertFalse(piece.isMoveValid(board.getField("H2"), board.getField("H1")));
        Assertions.assertFalse(piece.isMoveValid(board.getField("E8"), board.getField("F1")));
        Assertions.assertFalse(piece.isMoveValid(board.getField("F1"), board.getField("E8")));
    }

    @Test
    @Order(10)
    @DisplayName("Rook on Blank Board - Correct Movement")
    public void testRookMovementBlankBoardCorrect(){
        IChessPiece piece = new Rook();
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
    @Order(11)
    @DisplayName("Rook on Blank Board - Incorrect Movement")
    public void testRookMovementBlankBoardIncorrect(){
        IChessPiece piece = new Rook();
        Assertions.assertFalse(piece.isMoveValid(board.getField("A1"), board.getField("C3")));
        Assertions.assertFalse(piece.isMoveValid(board.getField("C3"), board.getField("A1")));
        Assertions.assertFalse(piece.isMoveValid(board.getField("A1"), board.getField("H8")));
        Assertions.assertFalse(piece.isMoveValid(board.getField("H8"), board.getField("A1")));
        Assertions.assertFalse(piece.isMoveValid(board.getField("H1"), board.getField("A8")));
        Assertions.assertFalse(piece.isMoveValid(board.getField("A8"), board.getField("H1")));

        Assertions.assertFalse(piece.isMoveValid(board.getField("A1"), board.getField("C2")));
        Assertions.assertFalse(piece.isMoveValid(board.getField("C2"), board.getField("A1")));
        Assertions.assertFalse(piece.isMoveValid(board.getField("A1"), board.getField("B3")));
        Assertions.assertFalse(piece.isMoveValid(board.getField("B3"), board.getField("A1")));

        Assertions.assertFalse(piece.isMoveValid(board.getField("D4"), board.getField("E6")));
        Assertions.assertFalse(piece.isMoveValid(board.getField("E6"), board.getField("D4")));
        Assertions.assertFalse(piece.isMoveValid(board.getField("E5"), board.getField("F3")));
        Assertions.assertFalse(piece.isMoveValid(board.getField("F3"), board.getField("E5")));
    }

    @Test
    @Order(12)
    @DisplayName("Pawn (White) on Blank Board - Correct Movement")
    public void testPawnMovementWhiteBlankBoardCorrect(){
        IChessPiece piece = new Pawn();
        piece.setPlayer(new Player(ChessPieceSideEnum.WHITE));

        Assertions.assertTrue(piece.isMoveValid(board.getField("A","1"), board.getField("A", "2")));
        Assertions.assertTrue(piece.isMoveValid(board.getField("A","2"), board.getField("A", "3")));

        Assertions.assertTrue(piece.isMoveValid(board.getField("D","2"), board.getField("D", "3")));
        Assertions.assertTrue(piece.isMoveValid(board.getField("D","3"), board.getField("D", "4")));

        Assertions.assertTrue(piece.isMoveValid(board.getField("H","7"), board.getField("H", "8")));
        Assertions.assertTrue(piece.isMoveValid(board.getField("B","7"), board.getField("B", "8")));
    }

    @Test
    @Order(13)
    @DisplayName("Pawn (Black) on Blank Board - Correct Movement")
    public void testPawnMovementBlackBlankBoardCorrect(){
        IChessPiece piece = new Pawn();
        piece.setPlayer(new Player(ChessPieceSideEnum.BLACK));

        Assertions.assertTrue(piece.isMoveValid(board.getField("A","7"), board.getField("A", "6")));
        Assertions.assertTrue(piece.isMoveValid(board.getField("A","6"), board.getField("A", "5")));

        Assertions.assertTrue(piece.isMoveValid(board.getField("D","3"), board.getField("D", "2")));
        Assertions.assertTrue(piece.isMoveValid(board.getField("D","4"), board.getField("D", "3")));

        Assertions.assertTrue(piece.isMoveValid(board.getField("H","2"), board.getField("H", "1")));
        Assertions.assertTrue(piece.isMoveValid(board.getField("B","2"), board.getField("B", "1")));
    }
    @Test
    @Order(12)
    @DisplayName("Pawn (White) on Blank Board - Incorrect Movement")
    public void testPawnMovementWhiteBlankBoardIncorrect(){
        IChessPiece piece = new Pawn();
        piece.setPlayer(new Player(ChessPieceSideEnum.WHITE));

        Assertions.assertFalse(piece.isMoveValid(board.getField("A","7"), board.getField("A", "6")));
        Assertions.assertFalse(piece.isMoveValid(board.getField("A","6"), board.getField("A", "5")));

        Assertions.assertFalse(piece.isMoveValid(board.getField("A","7"), board.getField("B", "7")));
        Assertions.assertFalse(piece.isMoveValid(board.getField("B","7"), board.getField("A", "6")));

        Assertions.assertFalse(piece.isMoveValid(board.getField("A","7"), board.getField("B", "8")));
        Assertions.assertFalse(piece.isMoveValid(board.getField("B","8"), board.getField("A", "7")));

        Assertions.assertFalse(piece.isMoveValid(board.getField("D","5"), board.getField("C", "6")));
        Assertions.assertFalse(piece.isMoveValid(board.getField("C","6"), board.getField("D", "5")));


    }

    @Test
    @Order(13)
    @DisplayName("Pawn (Black) on Blank Board - Incorrect Movement")
    public void testPawnMovementBlackBlankBoardIncorrect(){
        IChessPiece piece = new Pawn();
        piece.setPlayer(new Player(ChessPieceSideEnum.BLACK));

        Assertions.assertFalse(piece.isMoveValid(board.getField("A","1"), board.getField("A", "2")));
        Assertions.assertFalse(piece.isMoveValid(board.getField("A","2"), board.getField("A", "3")));

        Assertions.assertFalse(piece.isMoveValid(board.getField("A","7"), board.getField("B", "7")));
        Assertions.assertFalse(piece.isMoveValid(board.getField("B","7"), board.getField("A", "6")));

        Assertions.assertFalse(piece.isMoveValid(board.getField("A","7"), board.getField("B", "8")));
        Assertions.assertFalse(piece.isMoveValid(board.getField("B","8"), board.getField("A", "7")));

        Assertions.assertFalse(piece.isMoveValid(board.getField("D","5"), board.getField("C", "6")));
        Assertions.assertFalse(piece.isMoveValid(board.getField("C","6"), board.getField("D", "5")));

    }

}
