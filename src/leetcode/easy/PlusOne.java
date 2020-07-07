package leetcode.easy;

public class PlusOne {
    // url : https://leetcode.com/problems/plus-one/

    public int[] plusOne(int[] digits) {
        boolean needAdd = false;
        for (int i = digits.length - 1; i >= 0; --i) {
            if (digits[i] + 1 < 10) {
                needAdd= false;
                digits[i] = digits[i] + 1;
                break;
            }

            digits[i] = 0;
            needAdd= true;
        }

        if (needAdd) {
            int[] tmp = new int[digits.length + 1];
            tmp[0] = 1;
            for (int i = tmp.length - 1; i > 0; --i) {
                tmp[i] = digits[i - 1];
            }
            digits = tmp;
        }

        return digits;
    }
}
