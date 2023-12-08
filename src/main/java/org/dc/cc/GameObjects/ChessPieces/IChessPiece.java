package org.dc.cc.GameObjects.ChessPieces;

import org.dc.cc.GameObjects.Chessboard.Field;

public interface IChessPiece {
    boolean isMoveValid(Field fromField, Field toField);
}
