package leetcode.easy;

public class DetectCapital {
    // url : https://leetcode.com/problems/detect-capital/

    public boolean detectCapitalUse(String word) {
        char[] chars = word.toCharArray();

        boolean isFirstUpper = chars[0] >= 'A' && chars[0] <= 'Z';
        boolean isUpperExist = false;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') { // 대문자
                if (!isFirstUpper || (i > 1 && !isUpperExist))
                    return false;
                isUpperExist = true;
            } else if (isUpperExist) {
                return false;
            }
        }

        return true;
    }
}
