package org.dc.cc.Utilities;

import org.dc.cc.Engine.ChessMatch;

public class DataImporter {
    public static ChessMatch initiateNewChessMatch(){
        return JsonImporter.importNewGameChessBoard();
    }
}
