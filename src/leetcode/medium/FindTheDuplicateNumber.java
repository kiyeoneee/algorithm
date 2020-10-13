package leetcode.medium;

import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicateNumber {
    /*
     * url : https://leetcode.com/problems/find-the-duplicate-number/
     * 1~n개의 모두 다른 숫자 중 하나의 중복된 수를 찾는 문제라면 모두 더한다음 총합의 값을 빼주면 됨
     * 하지만... 전부다 같은 숫자가 있는 케이스도 있다. 가장 단순히 set에 넣어서 중복을 확인한다.
     * 다른 방법은 소팅하면 됨!
     *
     * Runtime : faster than 50.03% of Java online submissions
     * Memory Usage : less than 15.59% of Java online submissions
     * Time complexity : O(n)
     * Space complexity : O(1)
     */
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        int result = nums[0];
        for (int i : nums) {
            if (set.contains(i)) {
                result = i;
                break;
            }

            set.add(i);
        }

        return result;
    }
}
