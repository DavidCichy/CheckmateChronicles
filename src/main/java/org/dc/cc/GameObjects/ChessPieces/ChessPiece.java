package org.dc.cc.GameObjects.ChessPieces;

import org.dc.cc.GameObjects.Chessboard.Field;

public interface ChessPiece {
    ChessPieceType Type();
    Field Position();
    void move(Field to_field);

}
