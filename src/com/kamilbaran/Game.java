package com.kamilbaran;

import java.util.Scanner;

public class Game {

    public static Player p1 = new Player("Kamil", "cross");
    public static Player p2 = new Player("Bartek", "circle");
    public static Board board = new Board();

    public static void main(String[] args) {
        prepareGame();
    }

    private static void prepareGame() {
        do {
            play(p1);
            play(p2);
        } while(!board.isGameOver());

        System.out.println("Game over!");
    }

    private static void play(Player player) {
        System.out.println("Now plays: " + player.name);
        String cords = getPlayerInput();

        if (!board.setMark(player, cords)) {
            play(player);
        }

        System.out.println(player.name + " set " + player.character + " on " + cords);
    }

    private static String getPlayerInput() {
        System.out.println("Type your cords: ");
        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();
    }
}
