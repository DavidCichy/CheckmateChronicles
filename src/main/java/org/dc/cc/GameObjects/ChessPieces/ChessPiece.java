package org.dc.cc.GameObjects.ChessPieces;

import org.dc.cc.GameObjects.Players.Player;

public class ChessPiece {
    protected final ChessPieceTypeEnum type;
    protected Player player;
    protected String icon;
    public ChessPiece(ChessPieceTypeEnum type) {
        this.type = type;
    }

    public ChessPieceTypeEnum getType() {
        if (type == null) {
            return null;
        }
        return this.type;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }


    public String getIcon() {
        return this.icon;
    }
}
