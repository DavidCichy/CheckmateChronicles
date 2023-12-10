package org.dc.cc.GameObjects.ChessPieces;

public class ChessPiece {
    protected final ChessPieceTypeEnum Type;
    protected ChessPieceSideEnum Side;

    public ChessPiece(ChessPieceTypeEnum type) {
        Type = type;
    }
    public ChessPiece(ChessPieceSideEnum side, ChessPieceTypeEnum type) {
        Side = side;
        Type = type;
    }

    public ChessPieceTypeEnum getType() {
        return Type;
    }
}
