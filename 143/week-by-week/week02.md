# Week 02/10

- Review Exam 1 Study Guide
- BoardGames Assignment
  1. Look at GameEngine
  2. Look at TicTacToeBoard
     - Think about representation of 2D arrays
     - What is `marked` for?
     - constructor
     - toString()
     - mark()
     - isFull() and isGameOver()
     - checkWinner(): knows there is a winner, but not who.
  4. Connect4Board
     - Change in `GameEngine`: player's symbols, Board constructor, what does `extends` do?
     - constructor 6x7, all `.` except bottom row is 1-7
     - mark: do TicTacToe action, replace the removed spot if space (1-7)
  5. More OYO

## BoardGames

```java
public class TicTacToeBoard {
   protected char[][] board;
   protected int marked;

   public TicTacToeBoard() {
      board = new char[3][3];
      marked = 0;
      // TODO: Generate {{'1','2','3'}, {'4','5','6'}, {'7','8','9'}};
//       board[0][0] = '1';
//       board[0][1] = '2';
//       board[0][2] = '3';
      for(int r = 0; r < board.length; r++) {
         for(int c = 0; c < board[0].length; c++) {
            board[r][c] = ("" + ((r * 3) + c + 1)).charAt(0);
         }
      }
   }

   public boolean mark(int spot, char player) {
      char cSpot = (char)(spot + 48);  // ASCII int 49 = '1', 50 = '2',...
      for(int r = 0; r < board.length; r++) {
         for(int c = 0; c < board[0].length; c++) {
            if(board[r][c] == cSpot) {
               board[r][c] = player;
               marked++;
               return true;
            }
         }
      }
      return false;
   }

   public boolean isFull() {
      return marked == (board.length * board[0].length);
   }

   public boolean checkWinner() {
      return (board[0][0] == board[0][1] && board[0][0] == board[0][2]) || // first row
             (board[1][0] == board[1][1] && board[1][0] == board[1][2]) || // sec row
             (board[2][0] == board[2][1] && board[2][0] == board[2][2]) || // trd row
             (board[2][0] == board[1][1] && board[2][0] == board[0][2]) || // up dia
             (board[0][0] == board[1][1] && board[0][0] == board[2][2]);   // down dia
   }

   public boolean isGameOver() {
      return isFull() || checkWinner();
   }

   public String toString() {
      return board[0][0] + " | " + board[0][1] + " | " + board[0][2] + "\n" +
             "-- --- --\n" +
             board[1][0] + " | " + board[1][1] + " | " + board[1][2] + "\n" +
             "-- --- --\n" +
             board[2][0] + " | " + board[2][1] + " | " + board[2][2];
	}

}
```

```java
import java.util.*;

public class Connect4Board extends TicTacToeBoard {
   public Connect4Board() {
      board = new char[6][7];
      marked = 0;
      
      // fill top 5 rows with .
      for(int r = 0; r < 5; r++) {
         for(int c = 0; c < board[0].length; c++) {
            board[r][c] = '.';
         }
      }
      
      // fill the bottom row with 1-7
      for(int c = 0; c < board[0].length; c++) {
         board[5][c] = (char)(c + 49); // ASCII 49 = '1', 50 = '2', ...
      }
   }
   
   public boolean mark(int spot, char player) {
      boolean success = super.mark(spot, player);
      if(success) {
         for(int r = board.length - 1; r >= 0; r--) {
            if(board[r][spot-1] == '.') {
               board[r][spot-1] = (char)(spot + 48);
               return true;
            }
         }
      }
      return success;
   }
}
```

```java
import java.util.Scanner;

public class GameEngine {
   public static final char PLAYER_1 = 'r';
   public static final char PLAYER_2 = 'B';

   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      TicTacToeBoard board = new Connect4Board();
      boolean isP1 = false;

      do {
         isP1 = !isP1;
         System.out.println(board);
         playerTurn(console, board, isP1);
      } while( !board.isGameOver() );

      System.out.println();
      System.out.println("Good game!");
      System.out.println(board);
   }

   public static void playerTurn(Scanner console, TicTacToeBoard b, boolean isP1) {
      //set player to the person's turn
      char player = isP1 ? PLAYER_1 : PLAYER_2;

      //ask the user for the spot they want
      System.out.print("\nPlayer " + player + ", where would you like to go? > ");
      int spot = console.nextInt();

      //set that spot to the player's letter (char player)
      b.mark(spot, player);
   }
}
```
