package org.dc.cc.GameObjects.Chessboard;

import org.dc.cc.GameObjects.ChessPieces.ChessPiece;
import org.dc.cc.GameObjects.ChessPieces.ChessPieceTypeEnum;
import org.dc.cc.GameObjects.ChessPieces.IChessPiece;

public class Field {
    final private FilesEnum Column;
    final private RanksEnum Row;
    final private FieldBackgroundEnum Color;

    private IChessPiece chessPiece;
    public Field(FilesEnum column, RanksEnum row) {
        Column = column;
        Row = row;
        if ((column.ordinal() + row.ordinal())%2 == 0){
            Color = FieldBackgroundEnum.BLACK;
        } else {
            Color = FieldBackgroundEnum.WHITE;
        }
        chessPiece = null;
    }

    public FilesEnum getColumn() {
        return Column;
    }

    public RanksEnum getRow() {
        return Row;
    }

    public FieldBackgroundEnum getColor() {
        return Color;
    }

    public IChessPiece getChessPiece() {
        return chessPiece;
    }

    public void setChessPiece(IChessPiece chessPiece) {
        this.chessPiece = chessPiece;
    }

    public void removeChessPiece(){ chessPiece = null;
    }

    public boolean hasChessPiece(){return chessPiece != null;}

    public void showField(){

        System.out.print(String.valueOf("["));
        System.out.print(String.valueOf(Column));
        System.out.print(String.valueOf(Row.ordinal()+1));
        if (Color == FieldBackgroundEnum.WHITE){
            System.out.print("-W");
        } else if (Color == FieldBackgroundEnum.BLACK) {
            System.out.print("-B");
        }
        if (!this.hasChessPiece()){
            System.out.print("-O00000");
        } else {
            System.out.print("-");
            System.out.print(chessPiece.getIcon());
            System.out.print(String.valueOf(chessPiece.getPlayer().getSide()));
        }
        System.out.print(String.valueOf("] "));
        }
    }
