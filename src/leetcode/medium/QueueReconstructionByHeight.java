package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QueueReconstructionByHeight {
    // url : https://leetcode.com/problems/queue-reconstruction-by-height/
    // TODO: 2020/09/16 내가 로직을 생각해내지 못했다ㅠㅠ 결국 Discuss 봄ㅠㅠ 다시 풀어!

    /**
     * Array sorting
     * 소팅 조건을 파악하기가 어려운 문제였음
     * 기본적으로 내 앞의 사람 수대로 정렬 하고 키의 역순으로 정렬하면 되는 문제였던 것
     *
     * Time complexity : O(n)
     * Space complexity : O(1)
     */
    public int[][] reconstructQueue(int[][] people) {
        List<int[]> peopleList = new ArrayList<>(people.length);

        Arrays.sort(people, (a, b) -> {
            return (a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);
        });

        for (int[] a : people) {
            peopleList.add(a[1], a);
        }

        for (int i = 0; i < people.length; i++) {
            people[i] = peopleList.get(i);
        }

        return people;
    }
}
