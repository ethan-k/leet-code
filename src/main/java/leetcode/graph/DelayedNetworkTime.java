package leetcode.graph;

import java.util.*;

public class DelayedNetworkTime {

    public static void main(String[] args) {
        int[][] times = new int[][] {
                new int[] {2,1,1},
                new int[] {2,3,1},
                new int[] {3,4,1},
        };
        int n = 4;
        int k = 2;
//        int delayedTime = (new DelayedNetworkTime()).networkDelayTime(times, n, k);
        int delayedTime = (new DelayedNetworkTime()).networkDelayTimeWithMinHeap(times, n, k);
        System.out.println(delayedTime);
    }
    Map<Integer, Integer> dist = new HashMap<>();

    public int networkDelayTime(int[][] times, int N, int K) {

        Map<Integer, List<int[]>> graph = new HashMap<>();
        Set<Integer> settledNodes = new HashSet<>();
        Set<Integer> unsettledNodes = new HashSet<>();

        // Create a graph
        for (int[] node : times) {
            int source = node[0];
            int target = node[1];
            int distance = node[2];

            if (!graph.containsKey(source))
                graph.put(source, new ArrayList<>());

            graph.get(source).add(new int[]{target, distance});
        }

        for(int node = 1; node<=N; node++) {
            dist.put(node, Integer.MAX_VALUE);
        }
        dist.put(K, 0);
        unsettledNodes.add(K);

        while (!unsettledNodes.isEmpty()) {
            Integer currentNode = getLowestDistanceNode(unsettledNodes);
            unsettledNodes.remove(currentNode);
            if (graph.get(currentNode) != null) {
                for (int[] neighbor : graph.get(currentNode)) {
                    int adjacentNode = neighbor[0];
                    int weight = neighbor[1];
                    if (!settledNodes.contains(adjacentNode)) {
                        calculateMinimumDistance(adjacentNode, weight, currentNode);
                        unsettledNodes.add(adjacentNode);
                    }
                }
            }
            settledNodes.add(currentNode);
        }

        int ans = 0;
        for (Integer val : dist.values()) {
            if (val == Integer.MAX_VALUE)
                return -1;
            ans = Math.max(ans, val);
        }
        return ans;
    }

    public int networkDelayTimeWithMinHeap(int[][] times, int n, int k) {
        Set<Integer> settled = new HashSet<>();
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((n1, n2) -> n1[0] - n2[0]);

        // int[], int[0] = disatnce, int[1] node
        Map<Integer, List<int[]>> graph = new HashMap<>();
        for(int[] time: times) {
            if (!graph.containsKey(time[0])) {
                graph.put(time[0], new ArrayList<>());
            }
            graph.get(time[0]).add(new int[] {time[1], time[2]});
        }

        HashMap<Integer, Integer> dist = new HashMap<>();

        for(int i=1; i<=n; i++) {
            dist.put(i, Integer.MAX_VALUE);
        }
        dist.put(k, 0);


        minHeap.offer(new int[] {0, k});
        while(!minHeap.isEmpty()) {
            int[] currentNode = minHeap.poll();

            int distance = currentNode[0];
            int nodeNum = currentNode[1];

            if (graph.containsKey(nodeNum)) {
                for(int[] node: graph.get(nodeNum)) {
                    if (!settled.contains(node[0])) {
                        int newDistance = distance + node[1];
                        if (newDistance < dist.get(node[0])) {
                            dist.put(node[0], newDistance);
                            minHeap.offer(new int[] {newDistance, node[0]});
                        }
                    }
                }
            }
            settled.add(nodeNum);
        }
        if (settled.size() != n)
            return -1;

        int ans = 0;
        for(int val: dist.values())
            ans = Math.max(val, ans);
        return ans;
    }

    private void calculateMinimumDistance(Integer evaluationNode,
                                          Integer edgeWeigh, Integer sourceNode) {
        Integer sourceDistance = dist.get(sourceNode);
        if (sourceDistance + edgeWeigh < dist.get(evaluationNode)) {
            dist.put(evaluationNode, sourceDistance + edgeWeigh);
        }
    }

    private Integer getLowestDistanceNode(Set<Integer> unsettledNodes) {
        Integer lowestDistanceNode = null;
        int lowestDistance = Integer.MAX_VALUE;
        for (Integer node : unsettledNodes) {
            Integer nodeDistance = dist.get(node);
            if (nodeDistance < lowestDistance) {
                lowestDistance = nodeDistance;
                lowestDistanceNode = node;
            }
        }
        return lowestDistanceNode;
    }
}
