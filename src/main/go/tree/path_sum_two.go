package tree

var ret [][]int
var target int

func pathSum(root *TreeNode, sum int) [][]int {
	ret = [][]int{}
	target = sum
	traversePathSumTwo(root, []int{}, 0)
	return ret
}

func traversePathSumTwo(root *TreeNode, list []int, curSum int) {
	if root == nil {
		return
	}

	list = append(list, root.Val)

	if root.Left == nil && root.Right == nil && curSum+root.Val == target {
		tmp := make([]int, len(list))
		copy(tmp, list)
		ret = append(ret, tmp)
	} else {
		traversePathSumTwo(root.Left, list, curSum+root.Val)
		traversePathSumTwo(root.Right, list, curSum+root.Val)
	}

	list = list[:len(list)-1]
}
