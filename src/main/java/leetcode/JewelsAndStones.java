package leetcode;

public class JewelsAndStones {
    public static int numJewelsInStones(String J, String S) {
        return (int) S.chars().filter(value -> J.indexOf(value) != -1).count();
    }
}
