package programmers;

import java.util.HashSet;
import java.util.Set;

public class PickTwoToAdd {
    /**
     * url : https://programmers.co.kr/learn/courses/30/lessons/68644
     *
     * Array, Brute Force
     * 주어진 배열에서 두 개의 숫자를 뽑아서 더한 값의 unique & sorted 배열 구하기
     * brute force 방법밖에 없는 듯 하여 바로 풀었음
     * unique 조건을 본 순간 바로 Set 선택, 정렬이 필요하므로 TreeSet
    *
     * Time complexity : O(n^2)
     * Space complexity : O(1)
     */
    public int[] solution(int[] numbers) {
        Set<Integer> sumSet = new TreeSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                sumSet.add(numbers[i] + numbers[j]);
            }
        }

        return sumSet.stream().mapToInt(Integer::intValue).toArray();
    }}
}
