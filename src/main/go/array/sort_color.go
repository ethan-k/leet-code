package array

func sortColors(nums []int) {
	count := []int{0, 0, 0}

	for _, num := range nums {
		count[num]++
	}

	for i := len(nums) - 1; i >= 0; i-- {
		if count[2] != 0 {
			nums[i] = 2
			count[2]--
		} else if count[1] != 0 {
			nums[i] = 1
			count[1]--
		} else {
			nums[i] = 0
		}
	}
}
