package org.dc.cc.GameObjects.ChessPieces;

import org.dc.cc.GameObjects.Chessboard.Field;

public class Pawn extends ChessPiece implements IChessPiece{

    public Pawn() {
        super(ChessPieceTypeEnum.PAWN);
        super.icon = "P" ;}

    public boolean isMoveValid(Field fromField, Field toField) {
        if (super.player.getSide() == ChessPieceSideEnum.WHITE){
            return fromField.getColumn() == toField.getColumn() && toField.getRow().ordinal() - fromField.getRow().ordinal() == 1;
        }
        if (super.player.getSide() == ChessPieceSideEnum.BLACK){
            return fromField.getColumn() == toField.getColumn() && toField.getRow().ordinal() - fromField.getRow().ordinal() == -1;
        }

        return false;
    }
}
