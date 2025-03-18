class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int i = n-2;
        int goal = n-1;
        if(n == 1 && nums[0] >= 0){
            return true;
        }
        while(i >= 0 ){
            //System.out.println("num = "+nums[i]+" i = "+i+" goal = "+ goal);
            if(nums[i]+i>= goal){
                if(i == 0){
                    return true;
                }
                goal = i;
                i--;
            }else{
            i--;
            }
        }

        return false;
        
    }
}