package com.kamilbaran.tictactoe.board;

public class BoardFactory
{
    public static Board getBoard(int size) {
        if (size == 3) {
            return new ClassicBoard();
        }

        return null;
    }
}
