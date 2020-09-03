package leetcode.easy;

public class RepeatedSubstringPattern {
    // url : https://leetcode.com/problems/repeated-substring-pattern/

    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        for (int i = len / 2; i > 0; --i) {
            if (len % i == 0) {
                int first = 0;
                int second = i;

                while (second < len && s.charAt(first) == s.charAt(second)) {
                    ++first;
                    ++second;
                }

                if (second == len) {
                    return true;
                }
            }
        }

        return false;
    }
}
