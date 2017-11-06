package leecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class BaseballGame {

    public static void main(String[] args) {
	// write your code here
		String[] myIntArray = {"5","2","C","D","+"};
		System.out.println(calPoints(myIntArray));
		String[] myIntArray2 = {"5","-2","4","C","D","9","+","+"};
		System.out.println(calPoints(myIntArray2));

    }

	public static int calPoints(String[] ops) {
		Stack<Integer> validNumbers = new Stack();


		for (String s : ops) {
			try {
				int num = Integer.parseInt(s);
				validNumbers.push(num);
			} catch (NumberFormatException e) {
				if (s.equals("C")) {
					validNumbers.pop();
				} else if (s.equals("D")) {
					int num = validNumbers.pop();;
					validNumbers.push(num);
					validNumbers.push(num * 2);
				} else if (s.equals("+")) {
					int i1 = validNumbers.pop();
					int i2 = validNumbers.pop();
					int adder = i1+i2;
					validNumbers.push(i2);
					validNumbers.push(i1);
					validNumbers.push(adder);
				}
			}
		}
		int result = 0;
		for (Integer validNumber : validNumbers) {
			result += validNumber;
		}
		return result;
	}
}
