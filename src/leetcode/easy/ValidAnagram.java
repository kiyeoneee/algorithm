package leetcode.easy;

import java.util.Arrays;

public class ValidAnagram {
    // url : https://leetcode.com/problems/valid-anagram/

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] aChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(aChars);
        Arrays.sort(tChars);

        return Arrays.equals(aChars, tChars);
    }

    public boolean isAnagramFirst(String s, String t) {
        int[] chars = new int[26];
        for (int i = 0; i < s.length(); i++) {
            chars[s.charAt(i) - 'a'] = chars[s.charAt(i) - 'a'] + 1;
            chars[t.charAt(i) - 'a'] = chars[t.charAt(i) - 'a'] - 1;
        }

        for (int num : chars) {
            if (num != 0) {
                return false;
            }
        }

        return true;
    }
}
