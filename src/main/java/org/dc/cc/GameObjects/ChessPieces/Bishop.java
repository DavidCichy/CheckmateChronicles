package org.dc.cc.GameObjects.ChessPieces;

import org.dc.cc.GameObjects.Chessboard.Field;

public class Bishop extends ChessPiece implements IChessPiece{
    public Bishop() {
        Type = ChessPieceTypeEnum.BISHOP;
    }

    public boolean isMoveValid(Field fromField, Field toField) {
        if (Math.abs(fromField.getRow().ordinal() - toField.getRow().ordinal()) == Math.abs(fromField.getColumn().ordinal() - toField.getColumn().ordinal())){
            return true;
        }
        return false;
    }
}
