import java.util.*;;

public class dfs {

    public static void main(String[] args) {

        int[][] edgeList = {
                { 0, 1 },
                { 0, 2 },
                { 1, 3 },
                { 1, 4 },
                { 2, 4 }
        };
        // example for disconnected graph - node 5 is disconnected from all other nodes
        int vertices = 6;
        int start = 0;

        List<Integer> visitedNodes = depthFirstSearch(edgeList, vertices, start);

        for (int node : visitedNodes) {
            System.out.print(node + ",");
        }
    }

    public static List<Integer> depthFirstSearch(int[][] edgeList, int vertices, int start) {

        Map<Integer, List<Integer>> adjList = new HashMap<>();
        List<Integer> visitedNodes = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[vertices];

        // adjacency list
        for (int[] edge : edgeList) {
            int source = edge[0];
            int end = edge[1];

            if (adjList.get(source) != null) {
                List<Integer> neighList = adjList.get(source);
                neighList.add(end);
                adjList.put(source, neighList);

            } else {
                List<Integer> neighList = new ArrayList<>();
                neighList.add(end);
                adjList.put(source, neighList);
            }
        }

        visited[start] = true;
        stack.push(start);

        for (int i = 0; i < vertices; i++) {

            if (!visited[i]) {
                visited[i] = true;
                stack.push(i);
            }

            while (!stack.isEmpty()) {
                int element = stack.pop();

                List<Integer> neighbours = adjList.get(element);
                if (neighbours != null && !neighbours.isEmpty()) {
                    for (int neighbour : neighbours) {
                        if (!visited[neighbour]) { // avoid revisiting neighbour nodes again
                            visited[neighbour] = true;
                            stack.push(neighbour);
                        }
                    }
                }

                visitedNodes.add(element);
            }
        }

        return visitedNodes;

    }

}
