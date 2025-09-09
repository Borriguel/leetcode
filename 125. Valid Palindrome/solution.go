func isPalindrome(s string) bool {
	var cleaned strings.Builder
	for _, c := range s {
		if unicode.IsLetter(c) || unicode.IsDigit(c) {
			cleaned.WriteRune(unicode.ToLower(c))
		}
	}
	cleanedString := cleaned.String()
	tail := len(cleanedString) - 1
	for head := 0; head < tail; head++ {
		if cleanedString[head] == cleanedString[tail] {
			tail--
		} else {
			return false
		}
	}
	return true
}