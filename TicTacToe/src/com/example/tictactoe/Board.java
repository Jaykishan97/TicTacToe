package com.example.tictactoe;

public class Board {
    private static final int BOARD_SIZE = 3;
    private String[][] board = new String[BOARD_SIZE][BOARD_SIZE];
    
    public Board() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = "-";
            }
        }
    }
    
    public void display() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public boolean isFull() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (board[i][j].equals("-")) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean isValidMove(int row, int col) {
        return row >= 0 && row < BOARD_SIZE && col >= 0 && col < BOARD_SIZE && board[row][col].equals("-");
    }
    
    public void makeMove(int row, int col, String player) {
        board[row][col] = player;
    }
    
    public String getWinner() {
        // check rows
        for (int i = 0; i < BOARD_SIZE; i++) {
            if (!board[i][0].equals("-") && board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2])) {
                return board[i][0];
            }
        }
        
        // check columns
        for (int j = 0; j < BOARD_SIZE; j++) {
            if (!board[0][j].equals("-") && board[0][j].equals(board[1][j]) && board[1][j].equals(board[2][j])) {
                return board[0][j];
            }
        }
        
        // check diagonals
        if (!board[0][0].equals("-") && board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])) {
            return board[0][0];
        }
        
        if (!board[0][2].equals("-") && board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])) {
            return board[0][2];
        }
        
        return "-";
    }
}