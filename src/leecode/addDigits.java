package leecode;

public class addDigits {
	public int addDigits(int num) {
		while (num >= 10) {
			String[] numbers = String.valueOf(num).split("");
			if (numbers.length == 0) {
				return Integer.valueOf(numbers[0]);
			}
			num = 0;
			for (String number : numbers) {
				num += Integer.valueOf(number);
			}
		}
		return num;
	}
}
