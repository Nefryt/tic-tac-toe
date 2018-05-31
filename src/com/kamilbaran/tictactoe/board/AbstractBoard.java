package com.kamilbaran.tictactoe.board;

import java.util.Map;

abstract public class AbstractBoard
{
    public boolean isFieldEmpty(String cords, Map map) {
        if (cords == null || map.isEmpty()) {
            return false;
        }

        return map.get(cords).equals("");
    }
}
