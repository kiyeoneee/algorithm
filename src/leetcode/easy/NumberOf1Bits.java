package leetcode.easy;

public class NumberOf1Bits {
    // url : https://leetcode.com/problems/number-of-1-bits/

    public int hammingWeight(int n) {
        return Integer.bitCount(n);
    }
}
