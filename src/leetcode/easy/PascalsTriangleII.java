package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {
    // url : https://leetcode.com/problems/pascals-triangle-ii/

    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        result.add(1);

        for (int i = 0; i < rowIndex; i++) {
            List<Integer> tmp = new ArrayList<>();
            tmp.add(1);
            for (int j = 1; j <= i; j++) {
                tmp.add(result.get(j) + result.get(j - 1));
            }
            tmp.add(1);
            result = tmp;
        }

        return result;
    }
}
