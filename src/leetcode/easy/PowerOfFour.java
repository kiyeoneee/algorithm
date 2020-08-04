package leetcode.easy;

public class PowerOfFour {
    // url : https://leetcode.com/problems/power-of-four/

    public boolean isPowerOfFour(int num) {
        if (num < 4) {
            return num == 1;
        }

        while (num % 4 == 0) {
            num /= 4;
        }

        return num == 1;
    }
}
