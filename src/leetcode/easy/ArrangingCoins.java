package leetcode.easy;

public class ArrangingCoins {
    // url : https://leetcode.com/problems/arranging-coins/

    public int arrangeCoins(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        long k = (long)Math.sqrt(2 * (long)n);

        return (k * (k + 1))/2 > n ? (int)k - 1 : (int)k;
    }
}
