# Tic Tac Toe Game
This is a simple console-based implementation of the classic Tic Tac Toe game in Java. The game is built using an object-oriented design, with separate classes for the game board, players, and game itself.

## Getting Started
To get started with the game, you will need to have the following tools installed:

* Java Development Kit (JDK) 8 or later
* Eclipse IDE (optional)

Once you have these tools installed, you can download the source code for the game and import it into Eclipse or another IDE of your choice. Alternatively, you can compile and run the code directly from the command line.

## Running the Game
To run the game, you will need to create an instance of the Game class and call its methods to display the board, make moves, and check for a winner. Here is some example code that demonstrates how to play a game:

~~~
Board board = new Board();
Player player1 = new Player("X");
Player player2 = new Player("O");
Game game = new Game(board, player1, player2);

while (!game.isOver()) {
    game.displayBoard();
    Player currentPlayer = game.getCurrentPlayer();
    System.out.println("It is " + currentPlayer.getName() + "'s turn.");
    System.out.print("Enter row number: ");
    int row = scanner.nextInt();
    System.out.print("Enter column number: ");
    int col = scanner.nextInt();
    if (!game.playMove(row, col)) {
        System.out.println("Invalid move, please try again.");
    }
}

Player winner = game.getWinner();
if (winner != null) {
    System.out.println(winner.getName() + " wins!");
} else {
    System.out.println("The game is a tie.");
}
~~~

This code creates a new game with an empty board and two players, X and O. It then enters a loop where it displays the board, prompts the current player for their move, and checks if the move is valid. Once the game is over, it prints the winner (if there is one) or declares a tie.

## Customizing the Game
You can customize the game by modifying the Board, Player, and Game classes to suit your needs. For example, you could add a graphical user interface, change the size of the board, or implement a different scoring system.

## License
This game is licensed under the MIT License. You are free to use, modify, and distribute the code as you see fit. However, I make no guarantees or warranties about the quality or suitability of the code for any particular purpose.
