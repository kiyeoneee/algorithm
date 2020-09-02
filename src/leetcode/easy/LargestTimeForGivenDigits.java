package leetcode.easy;

public class LargestTimeForGivenDigits {
    // url : https://leetcode.com/problems/largest-time-for-given-digits/

    public String largestTimeFromDigits(int[] A) {
        String result = "";

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    if (i == j || j == k || i == k) {
                        continue;
                    }

                    String hour = A[i] + "" + A[j];
                    String min = A[k] + "" + A[6-i-j-k];

                    if (hour.compareTo("24") < 0 && min.compareTo("60") < 0) {
                        String time = hour + ":" + min;
                        result = result.compareTo(time) < 0 ? time : result;
                    }
                }
            }
        }

        return result;
    }
}
