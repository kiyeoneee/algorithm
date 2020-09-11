package leetcode.medium;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    // url : https://leetcode.com/problems/longest-substring-without-repeating-characters
    // TODO: 2020/09/11 BruteForce 방식이 아닌 방법으로 풀어보

    /**
     * Brute force
     * dp로 풀 수 있지 않을까? 하고 고민했지만
     * dp로 푼다 하더라도 이중 루프가 추가될 것 같아
     * 우선 가장 단순한 방법으로 풀어봄
     *
     * Time complexity : O(n^2)
     * Space complexity : O(n)
     */
    public int lengthOfLongestSubstring(String s) {
        Set<String> charSet;

        int maxLen = 0, len = 0;
        for (int i = 0; i < s.length(); i++) {
            charSet = new HashSet<>();
            charSet.add(String.valueOf(s.charAt(i)));
            len = 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (charSet.contains(String.valueOf(s.charAt(j)))) {
                    break;
                } else {
                    ++len;
                }

                charSet.add(String.valueOf(s.charAt(j)));
            }
            maxLen = maxLen > len ? maxLen : len;
        }

        return maxLen;
    }
}
