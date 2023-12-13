package org.dc.cc.Engine;

import org.dc.cc.GameObjects.Chessboard.Board;
import org.dc.cc.GameObjects.Chessboard.Field;
import org.dc.cc.GameObjects.Players.Player;
import org.dc.cc.Utilities.FieldMapper;

import java.util.ArrayList;

public class ChessMatch {
    Board board;
    ArrayList<Player> players;

    public ChessMatch(Board board, ArrayList<Player> players) {
        this.board = board;
        this.players = players;
    }

    public Board getBoard() {
        return board;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void moveChessPiece(Field fromField, Field toField){
        try{board.moveChessPiece(fromField,toField);}
        catch (IncorrectMovementError e){
            System.out.println(e);
        }
    }


    public void moveChessPiece(String fromField, String toField){
        moveChessPiece(FieldMapper.mapField(fromField, board), FieldMapper.mapField(toField, board));
    }
}
