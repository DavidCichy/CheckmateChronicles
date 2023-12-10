package org.dc.cc.GameObjects.Players;

import org.dc.cc.GameObjects.ChessPieces.ChessPiece;
import org.dc.cc.GameObjects.ChessPieces.ChessPieceSideEnum;

import java.util.LinkedList;

public class Player {
    private final ChessPieceSideEnum side;
    private LinkedList<ChessPiece> pieces;

    public Player(ChessPieceSideEnum side) {
        this.side = side;
        pieces = new LinkedList<>();
    }

    public ChessPieceSideEnum getSide() {
        return side;
    }

    public void addPiece(ChessPiece piece){
        pieces.add(piece);
    }

}
