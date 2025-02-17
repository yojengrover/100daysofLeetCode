class Solution {
    public int searchInsert(int[] nums, int t) {
        int n = nums.length;
        int low = 0; 
        int high = n-1;
        
        if(t<nums[0]){
            return 0;
        }
        while(low<= high){
            int mid = low + (high - low) / 2;
            
            
            if(t < nums[mid]){
                high = mid -1;
            }else if(t > nums[mid]){
                low = mid +1;
            }else{
                return mid;
                
            }
        }
        return low;
    }
}