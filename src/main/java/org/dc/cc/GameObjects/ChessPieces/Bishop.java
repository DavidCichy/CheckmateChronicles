package org.dc.cc.GameObjects.ChessPieces;

import org.dc.cc.GameObjects.Chessboard.Field;

public class Bishop extends ChessPiece implements IChessPiece{
    public Bishop() {
        Type = ChessPieceTypeEnum.BISHOP;
    }

    public boolean isMoveValid(Field fromField, Field toField) {
        return false;
    }
}
