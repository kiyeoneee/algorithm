package programmers.programmingpractice.bf;

public class MockExam {
    // url : https://programmers.co.kr/learn/courses/30/lessons/42840
    public int[] solution(int[] answers) {
        int[] answer = {};

        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int ra = 0, rb = 0, rc = 0, max = 0;

        for (int i = 0; i < answers.length; i++) {
            ra += (answers[i] == p1[i%p1.length] ? 1 : 0);
            rb += (answers[i] == p2[i%p2.length] ? 1 : 0);
            rc += (answers[i] == p3[i%p3.length] ? 1 : 0);

            max = (ra > rb ? (ra > rc ? ra : rc) : (rb > rc ? rb : rc));
        }

        int size = 0;
        if (ra == max) size++;
        if (rb == max) size++;
        if (rc == max) size++;

        answer = new int[size];
        int idx = 0;
        if (ra == max) answer[idx++] = 1;
        if (rb == max) answer[idx++] = 2;
        if (rc == max) answer[idx++] = 3;

        return answer;
    }
}
