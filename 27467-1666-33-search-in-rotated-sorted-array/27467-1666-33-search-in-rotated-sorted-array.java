class Solution {
    public int search(int[] nums, int t) {

        int n = nums.length;
int l = 0;
int h = n - 1;

// Find the index of the minimum element (rotation point)
while (l < h) {
    int mid = l + (h - l) / 2;
    if (nums[mid] > nums[h]) {
        l = mid + 1;
    } else {
        h = mid;
    }
}
int minIndex = l;  // Minimum element index

// Decide search range based on target position
l = 0;
h = n - 1;
if (t >= nums[minIndex] && t <= nums[h]) {  
    l = minIndex;  // Search in the right half
} else {
    h = minIndex - 1;  // Search in the left half
}

// Perform binary search
while (l <= h) {
    int mid = l + (h - l) / 2;
    if (nums[mid] == t) {
        return mid;
    } else if (nums[mid] > t) {
        h = mid - 1;
    } else {
        l = mid + 1;
    }
}

return -1;
        
    }
}