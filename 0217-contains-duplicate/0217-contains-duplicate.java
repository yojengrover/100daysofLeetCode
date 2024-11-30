class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set <Integer> map = new HashSet<>();
        boolean count= true;
            
           
        
            for(int i: nums){
                if(map.add(i)){
                    count = false;
                }
                else{
                    return true;
                }
            }
        return count;
    }
}