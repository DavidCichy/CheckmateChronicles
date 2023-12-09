package org.dc.cc.GameObjects.ChessPieces;

import org.dc.cc.GameObjects.Chessboard.Field;

public class Pawn extends ChessPiece implements IChessPiece{
    public Pawn() {
        Type = ChessPieceTypeEnum.PAWN;
    }

    public boolean isMoveValid(Field fromField, Field toField) {
        return false;
    }
}
