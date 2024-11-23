class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] rightA = new int[nums.length];
        int[] leftA = new int[nums.length];
            leftA[0] = 1;
            rightA[nums.length-1] = 1; 
       
        for(int i = 0;i<nums.length-1;i++){
            leftA[i+1] = nums[i]*leftA[i]; 
           
        
        }
        
        for(int i = nums.length - 1;i>=1;i--){
            rightA[i-1] = nums[i] * rightA[i];
            //System.out.println(rightA[i]);
        }
        
        
        int[] sol = new int[nums.length];
        
        for(int i = 0;i<nums.length;i++){
            // System.out.println(rightA[i]);
            // System.out.println(leftA[i]);
            sol[i] = leftA[i] * rightA[i];
        }
         
        return sol;
        
    }
}