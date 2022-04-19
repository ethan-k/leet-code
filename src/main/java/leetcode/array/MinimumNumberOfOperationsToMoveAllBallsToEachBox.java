package leetcode.array;

public class MinimumNumberOfOperationsToMoveAllBallsToEachBox {
    public int[] minOperations(String boxes) {

        int[] ans = new int[boxes.length()];

        int acc = 0;
        for(int i=0; i<boxes.length(); i++) {
            char ch = boxes.charAt(i);
            int moves = 0;

            for(int j=0; j<i; j++) {
                if (boxes.charAt(j) == '1') {
                    moves += Math.abs(j-i);
                }
            }

            for(int j=i+1; j<boxes.length(); j++) {
                if (boxes.charAt(j) == '1') {
                    moves += Math.abs(j-i);
                }
            }
            ans[i] = moves;
        }

        return ans;
    }
}
