package com.kamilbaran.tictactoe.board;

import com.kamilbaran.tictactoe.player.Player;

public interface Board
{
    boolean placeMark(String cords, Player p);

    void initializeCordsMap();
}
