import java.util.*;

class BFS {

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

        List<Integer> visitedNodes = breadthFirstSearch(edgeList, vertices, start);

        for (int node : visitedNodes) {
            System.out.print(node + ",");
        }
    }

    public static List<Integer> breadthFirstSearch(int[][] edgeList, int vertices, int start) {

        Map<Integer, List<Integer>> adjList = new HashMap<>();
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[vertices];
        List<Integer> visitedNodes = new ArrayList<>();

        // creating the adjacency list
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

        // adding the start element to the queue
        q.add(start);
        visited[start] = true;

        for (int i = 0; i < vertices; i++) {

            // handle cases for nodes which are disconnected
            if (!visited[i]) {
                visited[i] = true;
                q.add(i);
            }

            while (!q.isEmpty()) {
                int element = q.poll();
                List<Integer> neighbours = adjList.get(element);
                if (neighbours != null && !neighbours.isEmpty()) {
                    for (int neighbour : neighbours) {
                        if (!visited[neighbour]) {
                            visited[neighbour] = true;
                            q.add(neighbour);
                        }
                    }
                }
                visitedNodes.add(element);
            }
        }
        // get the element of the queue, get the neighbours, add them to queue and mark
        // it as visited (to avoid revisiting)

        return visitedNodes;

    }
}