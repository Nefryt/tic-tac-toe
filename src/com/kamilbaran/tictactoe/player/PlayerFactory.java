package com.kamilbaran.tictactoe.player;

public class PlayerFactory
{
    public static Player getPlayer(String name, String character) {
        if (character.equals("circle")) {
            return new PlayerCircle(name, "circle");
        }
        else if (character.equals("cross")) {
            return new PlayerCross(name, "cross");
        }

        return null;
    }
}
