package linkedlist

func findMiddleElement(head *ListNode) *ListNode {
	var prev *ListNode
	fast := head
	slow := head

	for fast != nil && fast.Next != nil {
		prev = slow
		slow = slow.Next
		fast = fast.Next.Next
	}

	if prev != nil {
		prev.Next = nil
	}
	return slow
}

func sortedListToBST(head *ListNode) *TreeNode {
	if head == nil {
		return nil
	}

	middle := findMiddleElement(head)

	node := TreeNode{
		Val: middle.Val,
	}

	node.Left = sortedListToBST(middle)
	node.Right = sortedListToBST(middle.Next)

	return &node
}

func sortedListToBSTIteratively(head *ListNode) *TreeNode {
	array := getArray(head)
	l := len(array)

	return sortedListToBSTIterativelyHelper(0, l-1, array)
}

func getArray(head *ListNode) []*ListNode {
	var array []*ListNode

	for head != nil {
		array = append(array, head)
		head = head.Next
	}

	return array
}

func sortedListToBSTIterativelyHelper(left int, right int, nodes []*ListNode) *TreeNode {

	if left < right {
		return nil
	}

	middle := left + right/2

	node := TreeNode{
		Val: nodes[middle].Val,
	}

	node.Left = sortedListToBSTIterativelyHelper(left, middle-1, nodes)
	node.Right = sortedListToBSTIterativelyHelper(middle+1, right, nodes)

	return &node
}
