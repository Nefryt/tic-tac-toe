package com.kamilbaran.tictactoe.player;

public class PlayerCross implements Player
{
    private final String name;
    private final String character;

    public PlayerCross(String name, String character) {
        this.name = name;
        this.character = character;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getCharacter() {
        return this.character;
    }
}
