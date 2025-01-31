class Solution {
    public int[] twoSum(int[] nums, int target) {
        int t =0;
        int right = nums.length -1;
        int left = 0;

       for (int i = 0; i < nums.length; i++){
            t = nums[left]+nums[right];
            if( t == target ){
                
                break;
            }
            if(t > target ){
                    right--;

            }else{
           
                left++;
            }
        }
        
        
        int[] result = new int[2];
        result[0] = left +1;
        result[1] = right +1;
        
        

        return result;
    }
}