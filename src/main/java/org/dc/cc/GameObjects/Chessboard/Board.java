package org.dc.cc.GameObjects.Chessboard;

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
