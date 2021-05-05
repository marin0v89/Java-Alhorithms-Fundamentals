package l05_graphTheoryTraversalAndShortestPaths;

import java.util.*;

public class p03_shortestPath {

    public static boolean[] visited;
    public static int[] prevNodes;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n + 1; i++) {
            graph.add(new ArrayList<>());
        }
        int edges = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < edges; i++) {
            int[] paths = Arrays.stream(scan.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            graph.get(paths[0]).add(paths[1]);
        }
        int source = Integer.parseInt(scan.nextLine());
        int destination = Integer.parseInt(scan.nextLine());

        visited = new boolean[n + 1];
        prevNodes = new int[n + 1];

        bfs(graph, source, destination);

    }

    private static void bfs(List<List<Integer>> graph, int source, int destination) {

        Deque<Integer> queue = new ArrayDeque<>();

        queue.offer(source);
        visited[source] = true;
        while (!queue.isEmpty()) {
            int node = queue.poll();
            if (node == destination) {
                return;
            }
            for (int child : graph.get(node)) {
                if (!visited[child]) {
                    visited[child] = true;
                    prevNodes[child] = node;
                    queue.offer(child);
                }
            }
        }
    }
}