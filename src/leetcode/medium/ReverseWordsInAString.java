package leetcode.medium;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWordsInAString {
    // url : https://leetcode.com/problems/reverse-words-in-a-string/

    public String reverseWords(String s) {
        List splited = Arrays.asList(s.trim().split(" +"));

        Collections.reverse(splited);

        return String.join(" ", splited);
    }
}
