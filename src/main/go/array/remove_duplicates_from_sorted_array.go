package array

func removeDuplicates(nums []int) int {
	if len(nums) == 0 {
		return 0
	}

	j := 0
	for i := 0; i < len(nums); i++ {
		if nums[i] != nums[j] {
			i++
			nums[i] = nums[j]
		}
	}

	return j + 1

}
