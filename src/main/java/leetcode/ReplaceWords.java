package leetcode;

import java.util.Iterator;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ReplaceWords {
	public static void main(String[] args) {

		System.out.println(replaceWords(Arrays.asList("cat", "bat", "rat"), "the cattle was rattled by the battery"));
	}
	public static String replaceWords(List<String> dict, String sentence) {
		String[] words = sentence.split(" ");
		return Arrays.stream(words).map(word -> {
			Iterator<String> i = dict.iterator();
			String root = "";
			while(i.hasNext()) {
				root = i.next();
				if (word.startsWith(root)) {
					return root;
				}
			}
			return word;
		}).collect(Collectors.joining( " " ));
	}
}
