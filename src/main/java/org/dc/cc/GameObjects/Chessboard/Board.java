package org.dc.cc.GameObjects.Chessboard;

import org.dc.cc.Utilities.FieldMapper;

import java.util.ArrayList;
import java.util.List;

public class Board {
    List<Field> Fields;

    public Board() {
        create();
    }

    void create(){
        Fields = new ArrayList<>();
        for (FilesEnum column : FilesEnum.values()){
            for(RanksEnum row : RanksEnum.values()){
                Fields.add(new Field(column, row));
            }
        }
    }
    public Field getField(FilesEnum column, RanksEnum row) throws NullPointerException {
        for (int i = 0; i < Fields.size(); i++) {
            if (Fields.get(i).getColumn() == column && Fields.get(i).getRow() == row) {
                return Fields.get(i);
            }
        }
        return null;
    }
    public Field getField(String column, String row) throws NullPointerException {
        FieldMapper fm = new FieldMapper();
        return fm.mapField(column.toUpperCase(), row, this);
    }

    public Field getField(String cr) throws NullPointerException {
        String column = cr.substring(0,1).toUpperCase();
        String row = cr.substring(1,2);
        FieldMapper fm = new FieldMapper();
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
}
