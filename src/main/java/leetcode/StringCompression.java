package leetcode;

public class StringCompression {
//	public void test() {
//		LinkedList<Character> linkedList = new LinkedList<>();
//		linkedList.indexOf(1);
//		linkedList.p
//	}
//	public static void main(String[] args) {
//		char[] chars = {'a', 'b'};
//		compress(chars);
//	}
//
//	public static int compress(char[] chars) {
//		char[] result = new char[chars.length];
//		char target = chars[0];
//		int begin = 0;
//		int count = 1;
//		int countResult = 0;
//		for (int i = 0; i < chars.length - 1; i++) {
//			if (target != chars[i + 1]) {
//				result[begin] = target;
//				char[] countChars = String.valueOf(count).toCharArray();
//				if (count != 1) {
//					for (int j = 0; j < countChars.length; j++) {
//						result[i + j] = countChars[j];
//					}
//				}
//				begin = i + 1;
//				countResult += count;
//				count = 0;
//			} else {
//				count++;
//			}
//		}
//		chars = result;
//		return countResult;
//		//		for (Map.Entry<Character, Integer> characterIntegerEntry : map.entrySet()) {
//		//			int count = characterIntegerEntry.getValue();
//		//			if (count == 1) {
//		//				result +=1;
//		//			} else if ( count < 10) {
//		//				result += 2;
//		//			} else if ( count < 100) {
//		//				result += 3;
//		//			} else if (count < 1000) {
//		//				result += 4;
//		//			} else {
//		//				result += 5;
//		//			}
//		//		}
//		return result;
//	}
}
