package com.example.tictactoe;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Board board = new Board();
        Player player1 = new Player("X");
        Player player2 = new Player("O");
        Game game = new Game(board, player1, player2);
        
        System.out.println("Welcome to Tic Tac Toe!");
        game.displayBoard();
        
        while (!game.isOver()) {
            System.out.println(game.getCurrentPlayer().getName() + ", it's your turn.");
            System.out.print("Enter row (0-2): ");
            int row = scanner.nextInt();
            System.out.print("Enter column (0-2): ");
            int col = scanner.nextInt();
            
            if (!game.playMove(row, col)) {
                System.out.println("Invalid move. Try again.");
            }
        }
        
        game.displayBoard();
        System.out.println("Game over! " + game.getWinner().getName() + " wins.");
    }
}

