class Solution {
    public int[][] merge(int[][] intervals) {
        
        List<int[]> mergedList = new ArrayList<>();

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int[] currentInterval = intervals[0];
        mergedList.add(currentInterval);

        for (int i = 1; i < intervals.length; i++) {
            int[] nextInterval = intervals[i];
            // Check if intervals overlap
            if (currentInterval[1] >= nextInterval[0]) {
                // Merge intervals
                currentInterval[1] = Math.max(currentInterval[1], nextInterval[1]);
            } else {
                // Add non-overlapping interval to the list
                currentInterval = nextInterval;
                mergedList.add(currentInterval);
            }
        }

        // Convert List<int[]> to 2D array
        int[][] mergedArray = mergedList.toArray(new int[mergedList.size()][]);
        return mergedArray;

    }
}