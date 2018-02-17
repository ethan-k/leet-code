package leecode;

public class AssignCookies {
	public int findContentChildren(int[] g, int[] s) {
		int i = 0;
		int contentChildren = 0;
		while (i < g.length) {
			for (int k = 0; k < s.length; k++) {
				if (g[i] <= s[k]) {
					s[k] = 0;
					contentChildren++;
					break;
				}
			}
			i++;
		}
		return contentChildren;
	}
}
