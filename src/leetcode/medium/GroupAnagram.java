package leetcode.medium;

import java.util.*;

public class GroupAnagram {
    // url : https://leetcode.com/problems/group-anagrams/

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();

        Map<String, List<String>> anagramGroup = new HashMap<>();
        char[] anagramKey;

        for (String str : strs) {
            anagramKey = str.toCharArray();
            Arrays.sort(anagramKey);
            String keyStr = new String(anagramKey);

            List<String> tmp;
            if (anagramGroup.containsKey(keyStr)) {
                tmp = anagramGroup.get(keyStr);

            } else {
                tmp = new ArrayList<>();
            }

            tmp.add(str);
            anagramGroup.put(keyStr, tmp);
        }

        for (String key : anagramGroup.keySet()) {
            result.add(anagramGroup.get(key));
        }

        return result;
    }
}
