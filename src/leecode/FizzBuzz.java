package leecode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FizzBuzz {

    public static void main(String[] args) {

		System.out.println(fizzBuzz(30));
    }

	public static List<String> fizzBuzz(int n) {
		List<String> result = new ArrayList<>();
		IntStream.rangeClosed(1, n).forEach(value -> {
			if (value % 15 == 0) {
				result.add("FizzBuzz");
			} else if (value % 3 == 0) {
				result.add("Fizz");
			} else if (value % 5 == 0) {
				result.add("Buzz");
			} else {
				result.add(String.valueOf(value));
			}
		});
		return result;
	}
}
