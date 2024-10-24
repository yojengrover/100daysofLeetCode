class Solution {
    public int findClosestNumber(int[] nums) {
        boolean ispos =false;
        int temp, result;
        if(nums[0]>= 0){
        result = nums[0];
        }else{
            result = -1*nums[0];
        };
        for(int i = 0; i<nums.length; i++){
            temp = nums[i];
            if(nums[i] < 0){
            temp = temp * -1;
            }

            if(temp < result){
                result = temp;
            }
        }


        for(int i = 0; i<nums.length; i++){
            if(nums[i] == result){
                result = nums[i];
                i=nums.length -1;
                ispos = true;
            }
            
        }

        if(!ispos){
            result = -result;
        }
        
        return result;
    }
}