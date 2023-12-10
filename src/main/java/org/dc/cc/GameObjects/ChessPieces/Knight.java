package org.dc.cc.GameObjects.ChessPieces;

import org.dc.cc.GameObjects.Chessboard.Field;

public class Knight extends ChessPiece implements IChessPiece{
    public Knight() {
        super(ChessPieceTypeEnum.KNIGHT, "N");
    }

    public boolean isMoveValid(Field fromField, Field toField) {
        if (Math.abs(fromField.getColumn().ordinal() - toField.getColumn().ordinal()) == 2 && Math.abs(fromField.getRow().ordinal() - toField.getRow().ordinal()) == 1){
            return true;
        }
        if (Math.abs(fromField.getColumn().ordinal() - toField.getColumn().ordinal()) == 1 && Math.abs(fromField.getRow().ordinal() - toField.getRow().ordinal()) == 2){
            return true;
        }
        return false;
    }
}
