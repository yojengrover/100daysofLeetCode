class Solution {
    public int longestConsecutive(int[] nums) {
        //int[] sorted = new int[nums.length];
        //Arrays.sort(nums);
        HashSet<Integer> map = new HashSet<>();
        
        for(int i: nums){
            map.add(i);
        }
        int count = 0;
        int result = 0;
        for(int i: map){
            if(!map.contains(i-1)){
                count =1;
                int nextInt = i+1;
                while(map.contains(nextInt)){
                count++;
                nextInt++;    
                }
                if(result < count){
                result = count;
                }
            }
            else{
                count = 0;
            }
        }
        
        return result;
    }
}