package leetcode.dynamic;

import java.util.HashMap;
import java.util.Map;

public class CountSortedVowelStrings {
    public int countVowelStrings(int n) {

        Map<Integer, Map<Integer, Integer>> memo = new HashMap<>();
        for(int i=0; i<5; i++) {
            memo.put(i, new HashMap<>());
        }
        return countVowelStrings(0, n, memo);
    }

    public int countVowelStrings(int idx, int n, Map<Integer, Map<Integer, Integer>> memo) {

        if (memo.get(idx).containsKey(n)) {
            return memo.get(idx).get(n);
        }

        if (n == 0)
            return 1;

        int result = 0;
        for(int i=idx; i<5; i++) {
            result += countVowelStrings(i, n-1, memo);
        }

        memo.get(idx).put(n, result);
        return result;
    }
}
