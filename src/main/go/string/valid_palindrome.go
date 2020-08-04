package string

import (
	"strings"
	"unicode"
)

func isPalindrome(s string) bool {

	s = strings.ToLower(s)

	left := 0
	right := len(s) - 1

	for left <= right {
		if !unicode.IsLetter(rune(s[left])) && !unicode.IsDigit(rune(s[left])) {
			left++
		} else if !unicode.IsLetter(rune(s[right])) && !unicode.IsDigit(rune(s[right])) {
			right--
		} else {
			if s[right] != s[left] {
				return false
			}
			left++
			right--
		}

	}

	return true
}
