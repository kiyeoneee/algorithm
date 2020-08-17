package leetcode.medium;

public class SumOfTwoIntegers {
    // url : https://leetcode.com/problems/sum-of-two-integers/

    public int getSum(int a, int b) {
        int carry;

        while(b != 0) {
            carry = a & b;

            a = a ^ b;
            b = carry << 1;
        }

        return a;
    }
}
