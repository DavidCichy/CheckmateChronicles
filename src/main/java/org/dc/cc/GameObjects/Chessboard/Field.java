package org.dc.cc.GameObjects.Chessboard;

import org.dc.cc.GameObjects.ChessPieces.ChessPiece;

public class Field {
    final private FilesEnum Column;
    final private RanksEnum Row;
    final private FieldBackgroundEnum Color;

    private ChessPiece ChessPiece;
    public Field(FilesEnum column, RanksEnum row) {
        Column = column;
        Row = row;
        if ((column.ordinal() + row.ordinal())%2 == 0){
            Color = FieldBackgroundEnum.BLACK;
        } else {
            Color = FieldBackgroundEnum.WHITE;
        }
        ChessPiece = null;
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

    public ChessPiece getChessPiece() {
        return ChessPiece;
    }

    public void setChessPiece(ChessPiece chessPiece) {
        ChessPiece = chessPiece;
    }

    public void showField(){

        System.out.print(String.valueOf("["));
        System.out.print(String.valueOf(Column));
        System.out.print(String.valueOf(Row.ordinal()+1));
        if (Color == FieldBackgroundEnum.WHITE){
            System.out.print("-W");
        } else if (Color == FieldBackgroundEnum.BLACK) {
            System.out.print("-B");
        }
        System.out.print(String.valueOf("] "));
        }
    }
