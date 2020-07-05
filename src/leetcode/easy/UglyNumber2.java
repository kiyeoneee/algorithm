package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class UglyNumber2 {
    // url : https://leetcode.com/problems/ugly-number-ii/

    public int nthUglyNumber(int n) {
        if (n <= 1)
            return n;

        List<Integer> uglyNumbers = new ArrayList<>();
        uglyNumbers.add(1);

        int i = 0;
        int j = 0;
        int k = 0;

        while(uglyNumbers.size() < n) {
            int val2 = uglyNumbers.get(i) * 2;
            int val3 = uglyNumbers.get(j) * 3;
            int val5 = uglyNumbers.get(k) * 5;

            int min = Math.min(val2, Math.min(val3, val5));
            uglyNumbers.add(min);

            if (min == val2)
                ++i;
            if (min == val3)
                ++j;
            if (min == val5)
                ++k;
        }

        return uglyNumbers.get(uglyNumbers.size() - 1);
    }
}
