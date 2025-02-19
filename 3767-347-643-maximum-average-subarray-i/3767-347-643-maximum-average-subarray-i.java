class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double curSum = 0;
        double curAvg = 0;


        for (int i = 0; i < k; i++) {
             curSum += nums[i];
        }

        curAvg = curSum / k;  // Ensure floating-point division

        for (int i = k; i < n; i++) {
             curSum += nums[i] - nums[i - k];  // Add new element, remove old element
             double w = curSum / k; 
             curAvg = Math.max(w, curAvg);
        }

        return curAvg;
    }
}