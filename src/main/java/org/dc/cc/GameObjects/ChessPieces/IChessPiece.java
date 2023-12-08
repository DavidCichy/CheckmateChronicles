package org.dc.cc.GameObjects.ChessPieces;

import org.dc.cc.GameObjects.Chessboard.Field;

public interface IChessPiece {
    public ChessPieceTypeEnum getType();
    boolean isMoveValid(Field fromField, Field toField);
}
