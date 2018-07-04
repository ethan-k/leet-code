package leecode;

public class NumberOfLinesToWriteString {
    public int[] numberOfLines(int[] widths, String S) {
        int[] result = new int[2];
        int lineNu = 1;
        int curLineWidth = 0;
        for (char c : S.toCharArray()) {
            curLineWidth += widths[c - 97];
            if (curLineWidth > 100) {
                lineNu++;
                curLineWidth = widths[c - 97];
            }
        }
        result[0] = lineNu;
        result[1] = curLineWidth;
        return result;
    }
}
