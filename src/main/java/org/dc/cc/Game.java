package org.dc.cc;

import org.dc.cc.Engine.Engine;
import org.dc.cc.Utilities.FieldMapper;
import org.dc.cc.GameObjects.Chessboard.Board;

public class Game {
    public Game() {
        runGame();
    }

    void runGame(){
        Engine engine = new Engine();
        engine.createBoard();
        engine.showBoard();

    }
}
