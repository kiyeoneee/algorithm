package leetcode.medium;

import java.util.Arrays;

public class HIndex {
    // url : https://leetcode.com/problems/h-index/

    public int hIndex(int[] citations) {
        Arrays.sort(citations);

        int hIndex = 0;
        for (int i = citations.length - 1; i >= 0; --i) {
            int count = citations.length - i;
            if (citations[i] >= count) {
                hIndex = count;
            } else {
                break;
            }
        }

        return hIndex;
    }
}
