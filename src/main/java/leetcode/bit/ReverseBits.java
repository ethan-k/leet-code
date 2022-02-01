package leetcode.bit;

public class ReverseBits {
    public int reverseBits(int n) {

        int[] bits = new int[32];

        int i = 31;
        if (n < 0) {
            i =0;
            while (n != 0) {
                bits[i++] = n < 0 ? 1: 0;
                n <<= 1;
            }
        } else {
            while (n != 0) {
                bits[i--] = n % 2;
                n /= 2;
            }
        }
        int ret = 0;

        int num = 1;
        for(int j = 0; j<bits.length; j++) {
            if (bits[j] == 1) {
                ret = num + ret;
            }
            num = 2 * num;
        }

        return ret;
    }

    public static void main(String[] args) {
        ReverseBits reverseBits = new ReverseBits();
        System.out.println(reverseBits.reverseBits(2));
        System.out.println(reverseBits.reverseBits(-3));
        System.out.println(reverseBits.reverseBits(Integer.MAX_VALUE));
        System.out.println(reverseBits.reverseBits(Integer.MIN_VALUE));
    }
}
