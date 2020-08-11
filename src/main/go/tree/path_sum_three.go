package tree

var pathSumThreeTarget int
var count int
var h map[int]int

func pathSumThree(root *TreeNode, sum int) int {
	h = make(map[int]int)
	pathSumThreeTarget = sum
	count = 0
	pathSumThreeHelper(root, 0)
	return count
}

func pathSumThreeHelper(root *TreeNode, sum int) {

	if root == nil {
		return
	}

	sum += root.Val

	if sum == pathSumThreeTarget {
		count++
	}

	if _, ok := h[sum-pathSumThreeTarget]; ok {
		count = count + h[sum-pathSumThreeTarget]
	}

	if _, ok := h[sum]; !ok {
		h[sum] = 0
	}

	h[sum] = h[sum] + 1
	pathSumThreeHelper(root.Left, sum)
	pathSumThreeHelper(root.Right, sum)
	h[sum] = h[sum] - 1
}
