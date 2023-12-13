package org.dc.cc.Engine;

import org.dc.cc.GameObjects.Chessboard.Board;
import org.dc.cc.GameObjects.Players.Player;

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
}
