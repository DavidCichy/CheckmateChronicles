package org.dc.cc.GameObjects.ChessPieces;

import org.dc.cc.GameObjects.Chessboard.Field;

public class Pawn extends ChessPiece implements IChessPiece{
    public Pawn() {
        super(ChessPieceTypeEnum.PAWN);
    }
    public Pawn(ChessPieceSideEnum side) {
        super(side, ChessPieceTypeEnum.PAWN);
    }

    public boolean isMoveValid(Field fromField, Field toField) {
        if (super.Side == ChessPieceSideEnum.WHITE){
            return toField.getRow().ordinal() - fromField.getRow().ordinal() == 1;
        }
        if (super.Side == ChessPieceSideEnum.BLACK){
            return toField.getRow().ordinal() - fromField.getRow().ordinal() == -1;
        }

        return false;
    }
}
