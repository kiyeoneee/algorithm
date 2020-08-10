package leetcode.easy;

public class ExcelSheetColumnNumber {
    // url : https://leetcode.com/problems/excel-sheet-column-number/

    public int titleToNumber(String s) {
        int multi = 1;
        int result = 0;
        for (int i = s.length() - 1; i >= 0; --i) {
            result += (s.charAt(i) - 'A' + 1) * multi;

            multi *= 26;
        }

        return result;
    }
}
