package org.dc.cc.GameObjects.ChessPieces;

import org.dc.cc.GameObjects.Chessboard.Field;

public interface IChessPiece {
    ChessPieceType Type();
    boolean isMoveValid(Field fromField, Field toField);
    void move(Field tofield);

}
