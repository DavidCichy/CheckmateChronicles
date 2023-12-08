package org.dc.cc;

import org.dc.cc.Utilities.FieldMapper;
import org.dc.cc.GameObjects.Chessboard.Board;

public class Game {
    public Game() {
        runGame();
    }

    void runGame(){
        Board board = new Board();
        board.showBoard();
        FieldMapper fieldMapper = new FieldMapper();
        fieldMapper.mapField("A", "1", board).showField();
    }
}
