package com.kamilbaran.tictactoe.board;

import com.kamilbaran.tictactoe.player.Player;

import java.util.HashMap;
import java.util.Map;

public class ClassicBoard extends AbstractBoard implements Board
{
    private Map <String, String> map = new HashMap<>();
    
    public ClassicBoard() {
        this.initializeCordsMap();
    }

    @Override
    public boolean placeMark(String cords, Player p) {
        if (this.map.get(cords) == null || !this.isFieldEmpty(cords, this.map)) {
            return false;
        }

        this.map.put(cords, p.getCharacter());

        return true;
    }

    @Override
    public void initializeCordsMap() {
        String[] letters = {"A", "B", "C"};

        for (String letter : letters) {
            this.map.put(letter + 1, "");
            this.map.put(letter + 2, "");
            this.map.put(letter + 3, "");
        }
    }
}
