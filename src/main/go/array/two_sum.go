package array

func twoSum(nums []int, target int) []int {
	m := make(map[int]int)

	for i, num := range nums {
		if _, ok := m[num]; ok {
			//do something here
			return []int{i, m[num]}
		} else {
			m[target-num] = i
		}
	}

	return []int{-1, -1}
}
