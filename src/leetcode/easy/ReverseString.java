package leetcode.easy;

public class ReverseString {
    // url : https://leetcode.com/problems/reverse-string/

    public void reverseString(char[] s) {
        char tmp;

        for (int i = 0, j = s.length - 1; i < j; ++i, --j) {
            tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
        }
    }
}
