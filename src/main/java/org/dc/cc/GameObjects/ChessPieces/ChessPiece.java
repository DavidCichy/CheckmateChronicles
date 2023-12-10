package org.dc.cc.GameObjects.ChessPieces;

import org.dc.cc.GameObjects.Players.Player;

public class ChessPiece {
    protected final ChessPieceTypeEnum type;
    protected Player player;
    protected final String icon;
    public ChessPiece(ChessPieceTypeEnum type, String icon) {
        this.type = type;
        this.icon = icon;
    }

    public ChessPieceTypeEnum getType() {
        if (type != null) {
            return this.type;
        }
        return ChessPieceTypeEnum.NONE;
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
