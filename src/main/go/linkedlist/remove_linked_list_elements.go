package linkedlist

func removeElements(head *ListNode, val int) *ListNode {
	dummy := &ListNode{Val: 0}
	dummy.Next = head
	prev := dummy

	for head != nil {
		if head.Val == val {
			prev.Next = head.Next
		} else {
			prev = head
		}

		head = head.Next
	}

	return dummy.Next

}
