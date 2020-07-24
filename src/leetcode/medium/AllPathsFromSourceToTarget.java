package leetcode.medium;
import java.util.*;

public class AllPathsFromSourceToTarget {
    // url : https://leetcode.com/problems/all-paths-from-source-to-target/

    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<List<Integer>> queue = new LinkedList<>();
        queue.add(Arrays.asList(0));

        int goal = graph.length - 1;
        while(!queue.isEmpty()) {
            List<Integer> path = queue.poll();
            int last = path.get(path.size() - 1);

            if (last == goal) {
                result.add(new ArrayList<>(path));
            } else {
                int[] neighbors = graph[last];
                for (int neighbor : neighbors) {
                    List<Integer> list = new ArrayList<>(path);
                    list.add(neighbor);
                    queue.add(list);
                }
            }
        }

        return result;
    }
}
