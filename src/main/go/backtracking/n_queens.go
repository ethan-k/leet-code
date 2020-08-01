package backtracking

var board [][]byte
var ret [][]string

func solveNQueens(n int) [][]string {
	board = make([][]byte, n)
	for i := 0; i < n; i++ {
		row := make([]byte, n)
		for i2 := range row {
			row[i2] = '.'
		}
		board[i] = row
	}
	ret = [][]string{}
	placeNQueens(n, 0)
	return ret
}

func isSafe(x int, y int) bool {
	for i := 0; i < x; i++ {
		for j := 0; j < len(board); j++ {
			if board[i][j] == 'Q' && (x+j == y+i || i+j == x+y || y == j) {
				return false
			}
		}
	}
	return true
}

func placeNQueens(n int, placedRow int) {
	if n == placedRow {
		tmp := make([]string, n)
		for i := range board {
			tmp[i] = string((board)[i])
		}
		ret = append(ret, tmp)
		return
	}

	for col := 0; col < n; col++ {
		if isSafe(placedRow, col) {
			board[placedRow][col] = 'Q'
			placeNQueens(n, placedRow+1)
			board[placedRow][col] = '.'
		}
	}

}
