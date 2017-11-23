package leecode;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SelfDividingNumbers {
	public static void main(String[] args) {
		System.out.println(selfDividingNumbers(1, 22));
	}

	public static List<Integer> selfDividingNumbers(int left, int right) {
		return IntStream.rangeClosed(left, right).filter(value -> {
			char[] chars = String.valueOf(value).toCharArray();
			for (char aChar : chars) {
				if (aChar == '0') {
					return false;
				}
				if (value % Character.getNumericValue(aChar) != 0) {
					return false;
				}
			}
			return true;
		}).boxed().collect(Collectors.toList());
	}
}
