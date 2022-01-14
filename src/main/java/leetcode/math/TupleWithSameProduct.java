package leetcode.math;

import java.util.HashMap;
import java.util.Map;

public class TupleWithSameProduct {
    public int tupleSameProduct(int[] nums) {
        if (nums.length < 4)
            return 0;

        int ret = 0;

        Map<Integer, Integer> pairs = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int product = nums[i] * nums[j];
                pairs.put(product, pairs.getOrDefault(product, 0) + 1);
            }
        }

        for (Integer val : pairs.values()) {
            if (val >= 2) {
                int pairPermu = 0;
                for (int i = val - 1; i >= 1; i--) {
                    pairPermu += i;
                }
                ret += (4 * (pairPermu * 2));
            }
        }

        return ret;

    }

    public static void main(String[] args) {
        TupleWithSameProduct tupleWithSameProduct = new TupleWithSameProduct();
        System.out.println(tupleWithSameProduct.tupleSameProduct(new int[]{2, 3, 4, 6}));
        System.out.println(tupleWithSameProduct.tupleSameProduct(new int[]{1, 2, 3, 4, 6, 12}));

        // 1288
        System.out.println(tupleWithSameProduct.tupleSameProduct(new int[]{1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192}));
    }
}
