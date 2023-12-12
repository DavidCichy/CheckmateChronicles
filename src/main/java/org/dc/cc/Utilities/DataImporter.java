package org.dc.cc.Utilities;

import org.dc.cc.Engine.Match;

public class DataImporter {
    public static Match initiateNewChessMatch(){
        return JsonImporter.importNewGameChessBoard();
    }
}
