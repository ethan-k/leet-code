package leecode;

public class ConstructTheRectangle {

	//	1. The area of the rectangular web page you designed must equal to the given target area.
	//	2. The width W should not be larger than the length L, which means L >= W.
	//	3. The difference between length L and width W should be as small as possible.

	public int[] constructRectangle(int area) {
		int diff = area;
		int w = 1;
		int l = 0;
		int mW = 0;
		int mL = 0;
		while ( w <= area) {
			l = area / w;
			if ( w * l == area) {
				if (Math.abs(w - l) < diff) {
					mW = w;
					mL = l;
					diff = Math.abs(w - l);
				}
			}
			w++;
		}
		return new int[] {mL, mW};
	}
}
