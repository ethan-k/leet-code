package leecode;

public class StudentAttendanceRecordOne {
	public boolean checkRecord(String s) {
		char[] chars = s.toCharArray();
		int ACount = 0;
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == 'A') {
				ACount++;

			} else if (chars.length - i >= 3) {
				if (chars[i] == 'L' && chars[i + 1] == 'L' && chars[i + 2] == 'L') {
					return false;
				}
			}
		}
		if (ACount >= 2) {
			return false;
		}
		return true;
	}
}
