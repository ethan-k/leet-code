package leecode;

import java.util.ArrayList;
import java.util.HashMap;

public class EliminationGame {

	public static Character nonRepeating(String s) {
		HashMap<Character, Integer> set = new HashMap<>();
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (set.containsKey(chars[i])) {
				set.put(chars[i], -1);
			} else {
				set.put(chars[i], i);
			}
		}
		Character result = null;
		for (HashMap.Entry<Character, Integer> characterIntegerEntry : set.entrySet()) {
			if (characterIntegerEntry.getValue() != -1) {
				if (result != null) {
					if(set.get(result) > characterIntegerEntry.getValue()) {
						result = characterIntegerEntry.getKey();
					}
				} else {
					result = characterIntegerEntry.getKey();
				}

			}
		}
		return result;
	}

	public static void main(String[] args) {
		nonRepeating("aabbdbc");
	}

//	public int lastRemaining(int n) {
//		ArrayList<Integer> integers = new ArrayList<>();
//		for (int i = 1; ; i++) {
//			integers.add(i);
//			if (i == n) {
//				break;
//			}
//		}
//
//	}
}
