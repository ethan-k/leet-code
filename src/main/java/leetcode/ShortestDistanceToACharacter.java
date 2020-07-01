package leetcode;

import java.util.Arrays;

public class ShortestDistanceToACharacter {

    public static void main(String[] args) {
        String input = "loveleetcode";
        char c = 'e';
        System.out.println(Arrays.toString(shortestToChar(input, c)));
    }

    public static int[] shortestToChar(String S, char C) {
        int[] result = new int[S.length()];
        int resultIndex = 0;
        int lIndex = 0;
        int rIndex = 0;

        for (char c : S.toCharArray()) {
            int distance = 0;
            for (int i = 1; i < S.length(); i++) {
                if (C == c) {
                    break;
                }
                lIndex = lIndex -i;
                rIndex = rIndex + i;
                if (lIndex >= 0 && S.charAt(lIndex) == c) {
                    distance = resultIndex - lIndex;
                    break;
                }

                if (rIndex < S.length() && S.charAt(rIndex) == c) {
                    distance = rIndex - resultIndex;
                    break;
                }
                lIndex = 0;
                rIndex = 0;
            }

            result[resultIndex] = distance;
            resultIndex++;
        }
        return result;
    }
}
