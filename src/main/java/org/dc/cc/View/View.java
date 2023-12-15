package org.dc.cc.View;

import org.dc.cc.GameObjects.Chessboard.*;

public final class View {
    private View() {
    }

     public static void showField(Field field){

         System.out.print(String.valueOf("["));
         System.out.print(String.valueOf(field.getColumn()));
         System.out.print(String.valueOf(field.getRow().ordinal()+1));
         if (field.getColor() == FieldBackgroundEnum.WHITE){
             System.out.print("-W");
         } else if (field.getColor() == FieldBackgroundEnum.BLACK) {
             System.out.print("-B");
         }
         if (!field.hasChessPiece()){
             System.out.print("-O00000");
         } else {
             System.out.print("-");
             System.out.print(field.getChessPiece().getIcon());
             System.out.print(String.valueOf(field.getChessPiece().getPlayer().getSide()));
         }
         System.out.print(String.valueOf("] "));
     }

    public static void showBoard(Board board){
        for (int i = RanksEnum.values().length -1; i>=0; i--){
            RanksEnum row = RanksEnum.values()[i];
            for (FilesEnum column : FilesEnum.values()){
                board.getField(column, row).showField();
            }
            System.out.print("\n");
        }
    }
}
