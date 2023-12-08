import org.dc.cc.GameObjects.ChessPieces.ChessPiece;
import org.dc.cc.GameObjects.ChessPieces.King;
import org.dc.cc.GameObjects.Chessboard.Board;
import org.dc.cc.GameObjects.Chessboard.Field;
import org.dc.cc.GameObjects.Chessboard.FilesEnum;
import org.dc.cc.GameObjects.Chessboard.RanksEnum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Pieces_Movement {
    Board board = new Board();

    @Test
    public void testKingMovementCorrect(){
        King king = new King();
        Field fromField1 = new Field(FilesEnum.A, RanksEnum.ONE);
        Field toField1 = new Field(FilesEnum.B, RanksEnum.ONE);

        Field fromField2 = new Field(FilesEnum.B, RanksEnum.ONE);
        Field toField2 = new Field(FilesEnum.B, RanksEnum.TWO);

        Field fromField3 = new Field(FilesEnum.C, RanksEnum.FIVE);
        Field toField3 = new Field(FilesEnum.B, RanksEnum.FOUR);

        Field fromField4 = new Field(FilesEnum.D, RanksEnum.SIX);
        Field toField4 = new Field(FilesEnum.E, RanksEnum.SEVEN);

        Assertions.assertTrue(king.isMoveValid(fromField1, toField1));
        Assertions.assertTrue(king.isMoveValid(fromField2, toField2));
        Assertions.assertTrue(king.isMoveValid(fromField3, toField3));
        Assertions.assertTrue(king.isMoveValid(fromField4, toField4));
    }

    @Test
    public void testKingMovementIncorrect(){
        King king = new King();
        Field fromField1 = new Field(FilesEnum.A, RanksEnum.ONE);
        Field toField1 = new Field(FilesEnum.C, RanksEnum.ONE);

        Field fromField2 = new Field(FilesEnum.C, RanksEnum.ONE);
        Field toField2 = new Field(FilesEnum.A, RanksEnum.ONE);

        Field fromField3 = new Field(FilesEnum.C, RanksEnum.FIVE);
        Field toField3 = new Field(FilesEnum.C, RanksEnum.SEVEN);

        Field fromField4 = new Field(FilesEnum.C, RanksEnum.SEVEN);
        Field toField4 = new Field(FilesEnum.C, RanksEnum.FIVE);

        Assertions.assertFalse(king.isMoveValid(fromField1, toField1));
        Assertions.assertFalse(king.isMoveValid(fromField2, toField2));
        Assertions.assertFalse(king.isMoveValid(fromField3, toField3));
        Assertions.assertFalse(king.isMoveValid(fromField4, toField4));
    }
}
