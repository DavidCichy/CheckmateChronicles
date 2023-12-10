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
        return false;
    }
}
