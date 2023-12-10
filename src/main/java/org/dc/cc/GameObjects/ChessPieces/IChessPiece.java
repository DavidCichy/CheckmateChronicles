package org.dc.cc.GameObjects.ChessPieces;

import org.dc.cc.GameObjects.Chessboard.Field;
import org.dc.cc.GameObjects.Players.Player;

public interface IChessPiece {
    ChessPieceTypeEnum getType();
    void setPlayer(Player player);
    Player getPlayer();
    String getIcon();
    boolean isMoveValid(Field fromField, Field toField);
}
