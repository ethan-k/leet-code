package leecode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ImplementQueueUsingStacks {

	public static void main(String[] args) {
		MyQueue obj = new MyQueue();
		obj.push(2);
		obj.push(3);
		obj.push(4);
		obj.pop();
		obj.pop();
		obj.pop();
//		int param_2 = obj.pop();
		//		int param_3 = obj.peek();
//		System.out.println(obj.pop());
//		System.out.println(obj.peek());
		//		System.out.println(obj.empty());
		//		obj.pop();
//		System.out.println(obj.empty());
	}

	public static class MyQueue {
		private Stack<Integer> stack;

		/** Initialize your data structure here. */
		public MyQueue() {
			this.stack = new Stack<>();
		}

		/** Push element x to the back of queue. */
		public void push(int x) {
			stack.push(x);
		}

		/** Removes the element from in front of queue and returns that element. */
		public int pop() {
			List<Integer> tmp = new ArrayList<>();
			while (!this.stack.isEmpty()) {
				tmp.add(this.stack.pop());
			}
			int value = tmp.get(tmp.size() - 1);
			for (int j = tmp.size() - 2; j >= 0; j--) {
				stack.push(tmp.get(j));
			}
			return value;
		}

		/** Get the front element. */
		public int peek() {
			List<Integer> tmp = new ArrayList<>();
			while (!stack.isEmpty()) {
				tmp.add(stack.pop());
			}
			int value = tmp.get(tmp.size() - 1);
			for (int j = tmp.size() - 1; j >= 0; j--) {
				stack.push(tmp.get(j));
			}
			return value;
		}

		/** Returns whether the queue is empty. */
		public boolean empty() {
			return this.stack.size() == 0;
		}
	}

}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
