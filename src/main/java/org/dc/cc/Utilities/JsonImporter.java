package org.dc.cc.Utilities;

import org.dc.cc.Engine.ChessMatch;
import org.dc.cc.GameObjects.ChessPieces.*;
import org.dc.cc.GameObjects.Chessboard.Board;
import org.dc.cc.GameObjects.Players.Player;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.*;

public class JsonImporter {
    private static final String fileName = "src/main/resources/board.json";

    public static ChessMatch importNewGameChessBoard() {
        Board board = new Board();
        ArrayList<Player> players = new ArrayList<>();

        JSONParser parser = new JSONParser();

        try (Reader reader = new FileReader(fileName)) {

            JSONObject jsonObject = (JSONObject) parser.parse(reader);

            JSONArray sides = (JSONArray) jsonObject.get("chessPieces");
            for (Object side : sides){
                JSONObject side_obj = (JSONObject) side;
                String side_str = side_obj.get("player").toString();
                Player player = new Player(ChessPieceSideEnum.valueOf(side_str.toUpperCase()));
                players.add(player);

                for (Object chessPiece :  side_obj.keySet()){
                    try {
                        ChessPieceTypeEnum.valueOf(chessPiece.toString());
                        JSONArray chessPositions = (JSONArray) side_obj.get(chessPiece.toString());
                        for (Object chessPosition : chessPositions){
                        String chessClassName = "org.dc.cc.GameObjects.ChessPieces.".concat(chessPiece.toString().substring(0,1).toUpperCase().concat(chessPiece.toString().substring(1).toLowerCase()));
                        Class<?> chessClass = Class.forName(chessClassName);
                        IChessPiece chess = (IChessPiece) chessClass.newInstance();
                        chess.setPlayer(player);
                        player.addPiece(chess);
                        board.putChessPiece(chessPosition.toString(), chess);}
                    } catch (IllegalArgumentException ignored){}
                }
                }
            } catch (IOException | ParseException | ClassNotFoundException | InstantiationException |
                     IllegalAccessException ex) {
            throw new RuntimeException(ex);
        }


        return new ChessMatch(board, players);
    }
}
