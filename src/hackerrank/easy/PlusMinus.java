package hackerrank.easy;

public class PlusMinus {
    // url : https://www.hackerrank.com/challenges/plus-minus/problem

    static void plusMinus(int[] arr) {
        double total = (double) arr.length;
        double positive = 0, negative = 0, zero = 0;

        for (int num : arr) {
            if (num == 0)
                ++zero;
            else if (num > 0)
                ++positive;
            else
                ++negative;
        }

        System.out.println(String.format("%.6f", positive / total));
        System.out.println(String.format("%.6f", negative / total));
        System.out.println(String.format("%.6f", zero / total));
    }
}
