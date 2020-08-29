package hackerrank.easy;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayOfNElements {
    // url : https://www.hackerrank.com/challenges/fp-array-of-n-elements/problem

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        List<Integer> numbers = IntStream.range(0, num).boxed().collect(Collectors.toList());

        System.out.println(numbers.toString());
    }
}
