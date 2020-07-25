package tree

func levelOrder(root *TreeNode) [][]int {
	if root == nil {
		return [][]int{}
	}

	var levels [][]int

	traverse(root, &levels, 0)
	return levels
}

func traverse(node *TreeNode, levels *[][]int, level int) {

	if node == nil {
		return
	}

	if len(*levels) == level {
		*levels = append(*levels, []int{})
	}
	(*levels)[level] = append((*levels)[level], node.Val)

	if node.Left != nil {
		traverse(node.Left, levels, level+1)
	}

	if node.Right != nil {
		traverse(node.Right, levels, level+1)
	}
}
