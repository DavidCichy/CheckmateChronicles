package org.dc.cc.GameObjects.ChessPieces;

import org.dc.cc.GameObjects.Chessboard.Field;

public class King extends ChessPiece implements IChessPiece {
    public King() {
        Type = ChessPieceTypeEnum.KING;
    }

    public boolean isMoveValid(Field fromField, Field toField) {
        if (toField.getRow() == fromField.getRow() && Math.abs(fromField.getColumn().ordinal() - toField.getColumn().ordinal()) == 1){
            return true;
        }
        if (toField.getColumn() == fromField.getColumn() && Math.abs(fromField.getRow().ordinal() - toField.getRow().ordinal()) == 1){
            return true;
        }
        if (Math.abs(fromField.getColumn().ordinal() - toField.getColumn().ordinal()) == 1 && Math.abs(fromField.getRow().ordinal() - toField.getRow().ordinal()) == 1){
            return true;
        }
        return false;
    }

}
