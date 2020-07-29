package array

var ROWS int
var COLS int

func numIslands(grid [][]byte) int {

	ROWS = len(grid)

	if ROWS == 0 {
		return 0
	}

	COLS = len(grid[0])

	count := 0
	for i := 0; i < ROWS; i++ {
		for j := 0; j < COLS; j++ {
			if grid[i][j] == '1' {
				count++
				helper(grid, i, j)
			}
		}
	}

	return count

}

func helper(grid [][]byte, x int, y int) {

	if x < 0 || y < 0 || x == ROWS || y == COLS || grid[x][y] != '1' {
		return
	}

	grid[x][y] = '0'
	helper(grid, x+1, y)
	helper(grid, x-1, y)
	helper(grid, x, y-1)
	helper(grid, x, y+1)

}
