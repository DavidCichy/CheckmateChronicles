package org.dc.cc.GameObjects.Players;

import org.dc.cc.GameObjects.ChessPieces.ChessPiece;
import org.dc.cc.GameObjects.ChessPieces.ChessPieceSideEnum;
import org.dc.cc.GameObjects.ChessPieces.IChessPiece;

import java.util.LinkedList;

public class Player {
    private final ChessPieceSideEnum side;
    private LinkedList<IChessPiece> pieces;

    public Player(ChessPieceSideEnum side) {
        this.side = side;
        pieces = new LinkedList<>();
    }

    public ChessPieceSideEnum getSide() {
        return side;
    }

    public void addPiece(IChessPiece piece){
        pieces.add(piece);
    }

}
