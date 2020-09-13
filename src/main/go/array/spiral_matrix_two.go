package array

func generateMatrix(n int) [][]int {
	matrix := make([][]int, n)

	for i := range matrix {
		matrix[i] = make([]int, n)
	}

	dirs := [][]int{
		{0, 1},
		{1, 0},
		{0, -1},
		{-1, 0},
	}
	x := 0
	y := 0
	d := 0

	for i := 1; i <= n*n; i++ {
		matrix[x][y] = i
		xx := x + dirs[d][0]
		yy := y + dirs[d][1]

		if xx < 0 || yy < 0 || xx == n || yy == n || matrix[x][y] != 0 {
			d = (d + 1) % 4
			x = x + dirs[d][0]
			y = y + dirs[d][1]
		} else {
			x = xx
			y = yy
		}

	}

	return matrix
}
