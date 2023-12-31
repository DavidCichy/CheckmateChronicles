package org.dc.cc.Utilities;
import java.util.*;

import org.dc.cc.GameObjects.Chessboard.Board;
import org.dc.cc.GameObjects.Chessboard.Field;
import org.dc.cc.GameObjects.Chessboard.FilesEnum;
import org.dc.cc.GameObjects.Chessboard.RanksEnum;

public class FieldMapper {
    public FieldMapper() {
    }

    public static Field mapField(String inputColumn, String inputRow, Board board){
        Map<String, FilesEnum> columnMap = new HashMap<String, FilesEnum>();
        Map<String, RanksEnum> rowMap = new HashMap<String, RanksEnum>();
        for (FilesEnum file : FilesEnum.values()){
            columnMap.put(String.valueOf(file), file);
        }
        for (RanksEnum rank : RanksEnum.values()){
            rowMap.put(String.valueOf(rank.ordinal()+1), rank);

        }
        FilesEnum column = columnMap.get(inputColumn);
        RanksEnum row = rowMap.get(inputRow);
        return board.getField(column, row);
    }

    public static Field mapField(String inputField, Board board){
        return mapField(inputField.substring(0,1), inputField.substring(1,2), board);
    }
}
