package org.dc.cc.GameObjects.Chessboard;

import org.dc.cc.GameObjects.ChessPieces.ChessPiece;
import org.dc.cc.GameObjects.Players.Player;
import org.dc.cc.Utilities.FieldMapper;

import java.util.*;

public class Board {
    List<Field> fields;

    public Board() {
        create();
    }

    void create(){
        fields = new ArrayList<>();
        for (FilesEnum column : FilesEnum.values()){
            for(RanksEnum row : RanksEnum.values()){
                fields.add(new Field(column, row));
            }
        }
    }
    public Field getField(FilesEnum column, RanksEnum row) throws NullPointerException {
        for (int i = 0; i < fields.size(); i++) {
            if (fields.get(i).getColumn() == column && fields.get(i).getRow() == row) {
                return fields.get(i);
            }
        }
        return null;
    }
    public Field getField(String column, String row) throws NullPointerException {
        FieldMapper fm = new FieldMapper();
        return fm.mapField(column.toUpperCase(), row, this);
    }

    public Field getField(String cr) throws NullPointerException, IllegalArgumentException {
        if (cr.length() != 2){
            throw new IllegalArgumentException();
        }
        FieldMapper fm = new FieldMapper();
        String column = cr.substring(0,1).toUpperCase();
        String row = cr.substring(1,2);
        return fm.mapField(column, row, this);
    }

    public void showBoard(){
        for (int i = FilesEnum.values().length - 1; i >= 0; --i) {
            FilesEnum column = FilesEnum.values()[i];
            for(RanksEnum row : RanksEnum.values()){
                getField(column, row).showField();
            }
            System.out.print("\n");
        }
    }

    public void moveChessPiece(Field fromField, Field toField){
        if (!fromField.hasChessPiece()){
            throw new Error("No chesspiece on a field");
        }
        ChessPiece piece = fromField.getChessPiece();
        fromField.removeChessPiece();
        toField.setChessPiece(piece);
    }

    public void moveChessPiece(FilesEnum fromColumn, RanksEnum fromRow, FilesEnum toColumn, RanksEnum toRow){
        Field fromField = getField(fromColumn, fromRow);
        Field toField = getField(toColumn, toRow);
        moveChessPiece(fromField, toField);
    }

    public void moveChessPiece(String fromField, String toField){
        moveChessPiece(getField(fromField), getField(toField));
    }

    public void putChessPiece(Field field, ChessPiece chessPiece)
    {
        field.setChessPiece(chessPiece);
    }

    public void putChessPiece(String fieldString, ChessPiece chessPiece)
    {
        Field field = getField(fieldString);
        putChessPiece(field, chessPiece);
    }

    public Map<ChessPiece, Field> getChessPieceForPlayerList(Player player){
        Map<ChessPiece, Field> chessPiecesForPlayer = new HashMap<>();
        for (Field field : fields){
            if (field.hasChessPiece() && field.getChessPiece().getPlayer() == player){
                chessPiecesForPlayer.put(field.getChessPiece(), field);
            }
        }
        return chessPiecesForPlayer;
    }

    public void showPiecesOfPlayer(Player player){
        Map<ChessPiece, Field> chessPiecesForPlayer = getChessPieceForPlayerList(player);
        for (Map.Entry<ChessPiece, Field> piece: chessPiecesForPlayer.entrySet()){
            System.out.print(piece.getKey().getType());
            System.out.print(": ");
            System.out.print(piece.getValue().getColumn());
            System.out.print(piece.getValue().getRow().ordinal()+1);
            System.out.println();
        }
    }
}
