package leecode;

import java.util.Comparator;
import java.util.LinkedList;

public class MinStack {
	LinkedList<Integer> minNumbers;
	LinkedList<Integer> stack;

	/** initialize your data structure here. */
	public MinStack() {
		minNumbers = new LinkedList<>();
		stack = new LinkedList<>();
	}

	public void push(int x) {
		minNumbers.add(x);
		stack.push(x);
		minNumbers.sort(Comparator.naturalOrder());
	}

	public void pop() {
		int value = stack.pop();
		minNumbers.remove(Integer.valueOf(value));
		minNumbers.sort(Comparator.naturalOrder());
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		return minNumbers.getFirst();
	}
}
