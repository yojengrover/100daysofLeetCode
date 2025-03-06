class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {

        List<List<int[]>> ad = new ArrayList<>(n + 1);
        for (int i = 0; i <= n; i++) {
            ad.add(new ArrayList<>());
        }
        // Populate adjacency list
        for (int[] time : times) {
            int u = time[0];
            int v = time[1];
            int w = time[2];
            ad.get(u).add(new int[] { v, w });
        }
        // Initialize priority queue with comparator based on time
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.add(new int[] { k, 0 });
        // Map to store the minimum time to reach each node
        Map<Integer, Integer> minTimes = new HashMap<>();
        // Process the graph
        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int node = current[0];
            int time = current[1];
            if (minTimes.containsKey(node))
                continue;
            minTimes.put(node, time);
            for (int[] neighbor : ad.get(node)) {
                int nei = neighbor[0];
                int neiTime = neighbor[1];
                if (!minTimes.containsKey(nei)) {
                    pq.add(new int[] { nei, time + neiTime });
                }
            }
        }

        if (minTimes.size() == n) {
            return Collections.max(minTimes.values());
        } else {
            return -1;
        }

    }
}