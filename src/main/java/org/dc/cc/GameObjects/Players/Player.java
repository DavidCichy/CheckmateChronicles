package org.dc.cc.GameObjects.Players;

import org.dc.cc.GameObjects.ChessPieces.ChessPieceSideEnum;
import org.dc.cc.GameObjects.ChessPieces.IChessPiece;

import java.util.LinkedList;

public class Player {
    private final ChessPieceSideEnum side;
    private final LinkedList<IChessPiece> chessPieces;

    public Player(ChessPieceSideEnum side) {
        this.side = side;
        chessPieces = new LinkedList<>();
    }

    public ChessPieceSideEnum getSide() {
        return side;
    }

    public void addPiece(IChessPiece piece){
        chessPieces.add(piece);
    }

    public LinkedList<IChessPiece> getChessPieces() {
        return chessPieces;
    }
}
