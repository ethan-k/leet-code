package math

func mySqrt(x int) int {
	if x < 2 {
		return x
	}

	left := 2
	right := x / 2

	for left <= right {
		pivot := (right + left) / 2
		r := pivot * pivot
		if r < x {
			left = pivot + 1
		} else if r > x {
			right = pivot - 1
		} else {
			return pivot
		}
	}

	return right
}
