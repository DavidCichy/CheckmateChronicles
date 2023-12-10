package org.dc.cc.GameObjects.ChessPieces;

import org.dc.cc.GameObjects.Chessboard.Field;

public class Rook extends ChessPiece implements IChessPiece{
    public Rook() {
        super(ChessPieceTypeEnum.ROOK);
    }
    public Rook(ChessPieceSideEnum side) {
        super(side, ChessPieceTypeEnum.ROOK);
    }

    public boolean isMoveValid(Field fromField, Field toField) {
        return fromField.getColumn() == toField.getColumn() || fromField.getRow() == toField.getRow();
    }
}
