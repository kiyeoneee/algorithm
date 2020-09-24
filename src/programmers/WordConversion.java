package programmers;

public class WordConversion {
    // https://programmers.co.kr/learn/courses/30/lessons/43163
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        boolean isPossible = false;

        for (String word : words) {
            if (word.equals(target)) {
                boolean[] isChanged = new boolean[words.length];
                return change(begin, target, words, isChanged);
            }
        }

        return answer;
    }

    private int change(String begin, String target, String[] words, boolean[] isChecked) {
        int minCnt = 0;

        for (int i = 0; i < words.length; i++) {
            if (!isChecked[i] && isChangable(begin, words[i])) {
                if (words[i].equals(target))
                    return 1;

                isChecked[i] = true;
                int cnt = change(words[i], target, words, isChecked) + 1;
                minCnt = (minCnt == 0 || minCnt > cnt) ? cnt : minCnt;
                isChecked[i] = false;
            }
        }

        return minCnt;
    }

    private boolean isChangable(String w1, String w2) {
        boolean isCharDifferent = false;
        for (int i = 0; i < w1.length(); i++) {
            if (w1.charAt(i) != w2.charAt(i)) {
                if (isCharDifferent)
                    return false;
                isCharDifferent = true;
            }
        }

        return isCharDifferent;
    }
}

