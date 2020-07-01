package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {
	public List<Integer> partitionLabels(String S) {
		List<Integer> result = new ArrayList<>();

		int firstIndex = 0;
		int lastIndex = S.length();
		for (; ; ) {
			lastIndex = S.lastIndexOf(S.charAt(firstIndex));
			for (int j = firstIndex; j < lastIndex; j++) {
				char nestedChar = S.charAt(j);
				int nestedFirstIndex = S.indexOf(nestedChar);
				int nestedLastIndex = S.lastIndexOf(nestedChar);
				if (nestedFirstIndex == nestedLastIndex) {
					continue;
				}
				if (nestedLastIndex > lastIndex) {
					lastIndex = nestedLastIndex;
				}
			}
			result.add((lastIndex - firstIndex) + 1);
			firstIndex = lastIndex + 1;
			if (firstIndex >= S.length()) {
				break;
			}
		}
		return result;
	}
}
