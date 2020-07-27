package linkedlist

func getIntersectionNode(headA, headB *ListNode) *ListNode {
	set := map[*ListNode]bool{}

	for headA != nil {
		set[headA] = true
		headA = headA.Next
	}

	for headB != nil {
		_, ok := set[headB]
		if ok {
			return headB
		}
		headB = headB.Next
	}

	return nil
}
