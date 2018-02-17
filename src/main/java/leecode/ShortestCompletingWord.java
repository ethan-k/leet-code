package leecode;

import java.util.Arrays;
public class ShortestCompletingWord {
	public static void main(String[] args) {
		new ShortestCompletingWord().shortestCompletingWord("1s3 PSt", new String[] {"step","steps","stripe","stepple"});
	}
	public String shortestCompletingWord(String licensePlate, String[] words) {
		// licensePlate 에서 캐릭터 추출
		// 각단어마다 추출해서 비교
		// 중복되는 것에 대해서 중복 비교

		char[] ar = licensePlate.replaceAll("[^A-Za-z]+", "").toLowerCase().toCharArray();
		Arrays.sort(ar);
		String licensePlace = String.valueOf(ar);
		char[] tmpArr;
		String tmp;
		for (String word : words) {
			tmpArr = word.toCharArray();
			Arrays.sort(tmpArr);
			tmp = String.valueOf(tmpArr);
			if (tmp.contains(licensePlace)) {
				return word;
			}
		}
		return  null;
	}
}
