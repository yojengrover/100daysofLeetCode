class Solution {
    public int longestOnes(int[] nums, int k) {

int n = nums.length;
int l = 0, maxLen = 0, remainingK = k;

    for (int r = 0; r < n; r++) {
    if (nums[r] == 0) {
        remainingK--;
    }

    while (remainingK < 0) { 
        if (nums[l] == 0) {
            remainingK++;
        }
        l++;
    }

    maxLen = Math.max(maxLen, r - l + 1);
    }

    return maxLen;
    }
}