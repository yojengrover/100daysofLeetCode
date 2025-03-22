class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length - 1;
        boolean r = false;

        if(nums.length == 0){
            return 0;
        }else if(nums.length == 1 && nums[0] != val){
           return 1;
        }
        
        while(i < nums.length){
            if(nums[i] == val){
                r = true;
                while(i<j){
                    if(nums[j] == val){
                        j--;
                    }
                    else{
                        break;
                    }

                }
               
                nums[i] = nums[j];
                nums[j] = val;
                
            }
            
            i++;
            
        }
        if(!r){
            return j+1;
        }

        return j;
        
    }
}