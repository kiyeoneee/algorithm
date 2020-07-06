package leetcode.easy;

public class HammingDistance {
    // url : https://leetcode.com/problems/hamming-distance/

    public int hammingDistance(int x, int y) {
        int distance = 0;

        while (x > 0 || y > 0) {
            distance += (x % 2) ^ (y % 2);

            x >>= 1;
            y >>= 1;
        }

        return distance;
    }
}
