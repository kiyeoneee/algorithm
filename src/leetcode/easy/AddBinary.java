package leetcode.easy;

public class AddBinary {
    // url : https://leetcode.com/problems/add-binary/

    public String addBinary(String a, String b) {
        boolean isUpper = false;

        String result = "";
        int i = a.length() - 1, j = b.length() - 1;
        for (; i >= 0 && j >= 0; i--, j--) {
            if (a.charAt(i) == '1' && a.charAt(i) == b.charAt(j)) {
                result = isUpper ? "1" + result : "0" + result;
                isUpper = true;
            } else if (a.charAt(i) == '0' && a.charAt(i) == b.charAt(j)) {
                if (isUpper) {
                    result = "1" + result;
                    isUpper = false;
                } else {
                    result = "0" + result;
                }
            } else {
                if (isUpper) {
                    result = "0" + result;
                } else {
                    result = "1" + result;
                }
            }
        }

        if (i >= 0) {
            for (; i >= 0; i--) {
                if (isUpper) {
                    if (a.charAt(i) == '1') {
                        result = "0" + result;
                    } else {
                        result = "1" + result;
                        isUpper = false;
                    }
                } else {
                    result = a.substring(0, i + 1) + result;
                    break;
                }
            }
        }
        if (j >= 0) {
            for (; j >= 0; j--) {
                if (isUpper) {
                    if (b.charAt(j) == '1') {
                        result = "0" + result;
                    } else {
                        result = "1" + result;
                        isUpper = false;
                    }
                } else {
                    result = b.substring(0, j + 1) + result;
                    break;
                }
            }
        }

        return isUpper ? "1" + result : result;
    }
}
