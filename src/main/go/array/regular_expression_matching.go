package array

func isMatch(s string, p string) bool {
	if len(p) == 0 {
		return len(s) == 0
	}

	foundMatch := false

	if len(s) != 0 && (p[0] == s[0] || p[0] == '.') {
		foundMatch = true
	}
	if len(p) >= 2 && p[1] == '*' {
		return isMatch(s, p[2:]) || (foundMatch && isMatch(s[1:], p))
	} else {
		return foundMatch && isMatch(s[1:], p[1:])
	}
}
