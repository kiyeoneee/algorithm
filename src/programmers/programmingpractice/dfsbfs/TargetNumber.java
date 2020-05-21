package programmers.programmingpractice.dfsbfs;

public class TargetNumber {
    // url : https://programmers.co.kr/learn/courses/30/lessons/43165
    public int solution(int[] numbers, int target) {
        return calculateCount(numbers, target, 0, 0);
    }

    private int calculateCount(int[] numbers, int target, int index, int sum) {
        if (numbers.length <= index) {
            return sum == target ? 1 : 0;
        }

        return calculateCount(numbers, target, index + 1, sum + numbers[index])
                + calculateCount(numbers, target, index + 1, sum - numbers[index]);
    }
}
