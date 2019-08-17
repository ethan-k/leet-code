package leecode;

public class AvailableCapturesForRookAvailableCapturesForRook {

  public static void main(String[] args) {
    char[][] input = new char[][]{
        {'.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '.', 'R', '.', '.', '.', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.'}
    };

    char[][] input2 = new char[][]{
        {'.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '.', '.', 'p', '.', 'p', '.'},
        {'.', 'p', '.', '.', '.', '.', '.', '.'},
        {'.', 'p', 'B', '.', 'R', '.', 'B', 'p'},
        {'.', 'p', '.', '.', '.', 'B', '.', '.'},
        {'.', '.', 'p', '.', '.', 'p', '.', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.'}
    };

    System.out.println(new AvailableCapturesForRookAvailableCapturesForRook().numRookCaptures(input2));
  }

  public int numRookCaptures(char[][] board) {
    int length = board.length;
    int count = 0;
    int[] rookPosition = new int[2];
    for (int i = 0; i < length; ++i) {
      for (int j = 0; j < length; ++j) {
        if (board[i][j] == 'R') {
          rookPosition[0] = i;
          rookPosition[1] = j;
        }
      }
    }

    // left
    int x = 0;
    for (int i = rookPosition[0]; i > 0; i--) {
      if (board[i][rookPosition[1]] == 'B') {
        break;
      } else if (board[i][rookPosition[1]] == 'p') {
        count++;
        break;
      }
    }
    // right
    for (int i = rookPosition[0]; i < length; i++) {
      if (board[i][rookPosition[1]] == 'B') {
        break;
      } else if (board[i][rookPosition[1]] == 'p') {
        count++;
        break;
      }
    }
    // up
    for (int i = rookPosition[1]; i > 0; i--) {
      if (board[rookPosition[0]][i] == 'B') {
        break;
      } else if (board[rookPosition[0]][i] == 'p') {
        count++;
        break;
      }
    }
    // down
    for (int i = rookPosition[1]; i < length; i++) {
      if (board[rookPosition[0]][i] == 'B') {
        break;
      } else if (board[rookPosition[0]][i] == 'p') {
        count++;
        break;
      }
    }
    return count;
  }

}
