package com.kamilbaran;

import java.util.HashMap;
import java.util.Map;

public class Board
{
    public Map <String, String> map = new HashMap<>();
    
    public Board() {
        this.map.put("A1", "");
        this.map.put("A2", "");
        this.map.put("A3", "");
        this.map.put("B1", "");
        this.map.put("B2", "");
        this.map.put("B3", "");
        this.map.put("C1", "");
        this.map.put("C2", "");
        this.map.put("C3", "");
    }

    public boolean setMark(Player p, String cord) {
        if (this.map.get(cord) == null || !this.isFieldEmpty(cord)) {
            return false;
        }

        this.map.put(cord, p.character);

        return true;
    }

    public boolean isGameOver() {
        return true;
    }

    private boolean isFieldEmpty(String cord) {
        return this.map.get(cord).equals("");
    }
}
