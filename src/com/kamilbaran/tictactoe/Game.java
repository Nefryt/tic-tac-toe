package com.kamilbaran.tictactoe;

import com.kamilbaran.tictactoe.board.Board;
import com.kamilbaran.tictactoe.board.BoardFactory;
import com.kamilbaran.tictactoe.message.Message;
import com.kamilbaran.tictactoe.player.Player;
import com.kamilbaran.tictactoe.player.PlayerFactory;

import java.util.Scanner;

public class Game {

    private final Player p1 = PlayerFactory.getPlayer("Bartek", "cross");
    private final Player p2 = PlayerFactory.getPlayer("Kamil", "circle");
    private final Board board = BoardFactory.getBoard(3);

    public void run() {
        if (!this.playersAndBoardReady()) {
            Message.print("Error while creating Players and Board.");
            return;
        }

        do {
            this.play(this.p1);
            this.play(this.p2);
        } while(!this.isGameOver());

        Message.print("Game over!");
    }

    private void play(Player player) {
        Message.print("Now plays: " + player.getName());
        Message.print("Type your cords: ");

        String cords = this.getPlayerInput();

        if (!this.board.placeMark(cords, player)) {
            Message.print("Field not exists or isn't empty.");
            play(player);
        }

        Message.print(player.getName() + " set " + player.getCharacter() + " on " + cords);
    }

    private String getPlayerInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private boolean playersAndBoardReady() {
        return this.p1 != null && this.p2 != null && this.board != null;
    }

    private boolean isGameOver() {
        return true;
    }
}
