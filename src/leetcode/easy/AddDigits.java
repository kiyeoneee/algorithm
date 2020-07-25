package leetcode.easy;

public class AddDigits {
    // url : https://leetcode.com/problems/add-digits/

    public int addDigits(int num) {
        int result = 0;

        do {
            result += num % 10;
            num /= 10;

            result = (result / 10) + (result % 10);
        } while (num > 0);

        return result;
    }
}
