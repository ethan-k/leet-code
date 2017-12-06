package leecode;

public class FindTheDifference {
	public static void main(String[] args) {
		System.out.println(findTheDifference("abcd","abcde"));
	}

	public static char findTheDifference(String s, String t) {
		int[] ss = s.chars().sorted().map(operand -> (char) operand).toArray();
		int[] tt = t.chars().sorted().map(operand -> (char) operand).toArray();
		for(int i = 0; i < ss.length; i++) {
			if (ss[i] != tt[i]) {
				return (char) tt[i];
			}
		}
		return (char) tt[tt.length - 1];
	}
}
