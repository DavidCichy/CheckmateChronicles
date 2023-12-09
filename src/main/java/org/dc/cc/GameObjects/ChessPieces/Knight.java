package org.dc.cc.GameObjects.ChessPieces;

import org.dc.cc.GameObjects.Chessboard.Field;

public class Knight extends ChessPiece implements IChessPiece{
    public Knight() {
        Type = ChessPieceTypeEnum.KNIGHT;
    }

    public boolean isMoveValid(Field fromField, Field toField) {
        return false;
    }
}
