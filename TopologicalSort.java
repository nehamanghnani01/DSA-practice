import java.util.*;

public class TopologicalSort {

    public static void main(String[] args) {

        List<List<Integer>> edges = new ArrayList<>();
        int n = 6;

        edges.add(new ArrayList<>(Arrays.asList(2, 3)));
        edges.add(new ArrayList<>(Arrays.asList(3, 1)));
        edges.add(new ArrayList<>(Arrays.asList(4, 0)));
        edges.add(new ArrayList<>(Arrays.asList(4, 1)));
        edges.add(new ArrayList<>(Arrays.asList(5, 0)));
        edges.add(new ArrayList<>(Arrays.asList(5, 2)));

        Map<Integer, List<Integer>> adjList = getAdjList(edges, n);

        for (Map.Entry<Integer, List<Integer>> entry : adjList.entrySet()) {
            System.out.println("key = " + entry.getKey() + " and values = " + entry.getValue());
        }

        int[] arr = topologicalSort(adjList, n);

        System.out.println("Topological Sort --");
        for (int i : arr) {
            System.out.print(i + ",");
        }

    }

    public static void dfs(int i, int[] visited, Stack<Integer> stack, Map<Integer, List<Integer>> adjMap) {

        visited[i] = 1;

        List<Integer> adjMapping = adjMap.get(i);

        if (adjMapping != null && adjMapping.size() > 0) {
            for (int nodes : adjMapping) {
                if (visited[nodes] == 0) {
                    dfs(nodes, visited, stack, adjMap);

                }

            }

        }
        stack.push(i);

    }

    public static int[] topologicalSort(Map<Integer, List<Integer>> adjMap, int n) {

        int[] topologicalSort = new int[n];
        Stack<Integer> stack = new Stack<>();
        int[] visited = new int[n];

        for (int i = 0; i < n; i++) {
            if (visited[i] == 0) {

                dfs(i, visited, stack, adjMap);

            }
        }

        int j = 0;
        System.out.println("stack size = " + stack.size());

        while (!stack.isEmpty()) {
            topologicalSort[j] = stack.pop();
            j++;
        }

        return topologicalSort;
    }

    public static Map<Integer, List<Integer>> getAdjList(List<List<Integer>> edges, int n) {

        Map<Integer, List<Integer>> adjListMap = new HashMap<>();

        for (List<Integer> edge : edges) {
            int fromNode = edge.get(0);
            int toNode = edge.get(1);
            List<Integer> list;
            if (adjListMap.containsKey(fromNode)) {
                list = adjListMap.get(fromNode);
                list.add(toNode);
                adjListMap.put(fromNode, list);
            } else {
                list = new ArrayList<>();
                list.add(toNode);
                adjListMap.put(fromNode, list);
            }
        }

        return adjListMap;
    }

}
