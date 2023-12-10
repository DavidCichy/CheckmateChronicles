package org.dc.cc.GameObjects.ChessPieces;

import org.dc.cc.GameObjects.Chessboard.Field;

public class Queen extends ChessPiece implements IChessPiece{
    public Queen() {
        super(ChessPieceTypeEnum.QUEEN, "Q");
    }

    public boolean isMoveValid(Field fromField, Field toField) {

        if (fromField.getColumn() == toField.getColumn() || fromField.getRow() == toField.getRow()) {
            return true;
        }
        if (Math.abs(fromField.getColumn().ordinal() - toField.getColumn().ordinal()) == Math.abs(fromField.getRow().ordinal() - toField.getRow().ordinal())) {
            return true;
        }
        return false;
    }
}
