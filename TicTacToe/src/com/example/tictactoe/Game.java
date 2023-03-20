package com.example.tictactoe;

public class Game {
    private Board board;
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    
    public Game(Board board, Player player1, Player player2) {
        this.board = board;
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = player1;
    }
    
    public void displayBoard() {
        board.display();
    }
    
    public boolean isOver() {
        return board.isFull() || !board.getWinner().equals("-");
    }
    
    public Player getWinner() {
        String winner = board.getWinner();
        if (winner.equals(player1.getName())) {
            return player1;
        } else if (winner.equals(player2.getName())) {
            return player2;
        } else {
            return null;
        }
    }
    
    public Player getCurrentPlayer() {
        return currentPlayer;
    }
    
    public boolean playMove(int row, int col) {
        if (board.isValidMove(row, col)) {
            board.makeMove(row, col, currentPlayer.getName());
            if (currentPlayer == player1) {
                currentPlayer = player2;
            } else {
                currentPlayer = player1;
            }
            return true;
        } else {
            return false;
        }
    }
}

