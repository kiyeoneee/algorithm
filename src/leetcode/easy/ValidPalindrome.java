package leetcode.easy;

public class ValidPalindrome {
    // url : https://leetcode.com/problems/valid-palindrome/

    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        for (int i = 0, j = s.length() - 1; i < j; ++i, --j) {
            while (i < s.length() && !isAlphanumeric(s.charAt(i))) {
                if (i == s.length() -1 || i > j) {
                    return true;
                }
                ++i;
            }
            while (j >= 0 && !isAlphanumeric(s.charAt(j))) {
                if (j == 0 || i > j) {
                    return true;
                }
                --j;
            }

            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }

        return true;
    }

    private boolean isAlphanumeric(char c) {
        return (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
    }
}
