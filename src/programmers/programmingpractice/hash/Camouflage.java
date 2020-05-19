package programmers.programmingpractice.hash;

import java.util.HashMap;
import java.util.Map;

public class Camouflage {
    private static final int CLOTHES_TYPE_INDEX = 1;

    public int solution(String[][] clothes) {
        int answer = 1;

        Map<String, Integer> wearMap = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            String clothesType = clothes[i][CLOTHES_TYPE_INDEX];
            int wearCount = 1;

            if (wearMap.containsKey(clothesType)) {
                wearCount = wearMap.get(clothesType) + 1;
            }

            wearMap.put(clothesType, wearCount);
        }

        for (String key : wearMap.keySet()) {
            answer *= (wearMap.get(key) + 1);
        }

        return answer - 1;
    }
}
