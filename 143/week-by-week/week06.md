# Week 6

- Review recursive backtracking: Travel
- Review Exam 2
- Pair Sudoku #3
  - If using the provided starter files, note that solution is `char[][]`
  - ```java
    for(char val = '1'; val <= '9'; val++) {
    ```

## Solution for solve()

```java
public boolean solve() {
    // Base case: if the puzzle is already solved, return true
    if (isSolved()) {
        return true;
    }
    // Base case: if current board state is invalid, backtrack
    else if (!isValid()) {
        return false;
    }
    else {
        // Iterate through each cell in the board
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                if (board[r][c] == '.') {
                    // Try all possible numbers (1-9) in this cell
                    for (char num = '1'; num <= '9'; num++) {
                        board[r][c] = num;
                        // Recursively attempt to solve with this number placed
                        if (solve()) {
                            return true;
                        }
                        // Backwards: tries next num
                    }
                    // If no number (1-9) worked in this cell, backtrack further
                    return false;
                }
            }
        }
        return false;
    }
}
```