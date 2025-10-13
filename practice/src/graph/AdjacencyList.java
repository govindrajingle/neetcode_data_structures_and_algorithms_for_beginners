package graph;

import java.util.*;

class GraphNode {
    int val;
    List<GraphNode> neighbours;

    public GraphNode(int val) {
        this.val = val;
        this.neighbours = new ArrayList<>();
    }
}

public class AdjacencyList {
    public HashMap<String, ArrayList<String>> buildAdjList() {
        HashMap<String, ArrayList<String>> adjList = new HashMap<>();
        String[][] edges = {{"A", "B"}, {"B", "C"}, {"B", "E"}, {"C", "E"}, {"E", "D"}};
        HashSet<String> visit = new HashSet<>();
        adjList.put("A", new ArrayList<>());
        adjList.put("B", new ArrayList<>());
        for (String[] edge : edges) {
            String src = edge[0], dst = edge[1];
            if (!adjList.containsKey(src)) {
                adjList.put(src, new ArrayList<String>());
            }
            if (!adjList.containsKey(dst)) {
                adjList.put(dst, new ArrayList<String>());
            }
            adjList.get(src).add(dst);
        }
        return adjList;
    }

    //    dfs -> count paths (backtracking)
    public int dfs(String node, String target, HashMap<String, ArrayList<String>> adjList, HashSet<String> visit) {
        if (visit.contains(node)) return 0;
        if (node == target) return 1;
        int count = 0;
        visit = new HashSet<String>();
        visit.add(node);
        for (String neighbor : adjList.get(node))
            count += dfs(neighbor, target, adjList, visit);
        visit.remove(node);
        return count;
    }

    //    bfs -> the shortest path (unweighted)
    public int bfs(String node, String target, HashMap<String, ArrayList<String>> adjList) {
        int length = 0;
        HashSet<String> visit = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        visit.add(node);
        q.add(node);
        while (q.size() != 0) {
            int queueLength = q.size();
            for (int i = 0; i < queueLength; i++) {
                String curr = q.peek();
                q.poll();
                if (curr.equals(target)) {
                    return length;
                }
                for (String neighbor : adjList.get(curr)) {
                    if (!visit.contains(neighbor)) {
                        visit.add(neighbor);
                        q.add(neighbor);
                    }
                }
            }
            length += 1;
        }
        return length;
    }
}
