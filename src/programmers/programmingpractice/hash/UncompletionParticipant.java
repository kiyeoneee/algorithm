package programmers.programmingpractice.hash;

import java.util.Arrays;

public class UncompletionParticipant {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        int completionSize = completion.length;
        int i;
        for (i = 0; i < completionSize; i++) {
            if (!completion[i].equals(participant[i])) {
                break;
            }
        }

        return participant[i];
    }
}
