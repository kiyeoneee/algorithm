package leetcode.easy;

public class ReverseBits {
    // url : https://leetcode.com/problems/reverse-bits/submissions/

    public int reverseBits(int n) {
        for (int i = 0; i < 16; i++) {
            int j = 32 - i - 1;

            int a = (n >> i) & 1;
            int b = (n >> j) & 1;

            if ((a ^ b) != 0) {
                n ^= (1 << i) | (1 << j);
            }
        }

        return n;
    }
}
