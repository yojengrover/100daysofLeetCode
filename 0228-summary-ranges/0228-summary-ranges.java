class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if(nums.length > 0){
            //List<String> result = new ArrayList<>();
            int j = 0;
            for(int i = 0; i< nums.length; i++){
                if(i+1<nums.length && nums[i] + 1 == nums[i+1]){
                  int srt = nums[i];
                    while(i+1<nums.length && nums[i] + 1 == nums[i+1]){
                        i++;
                    }
                    result.add(srt + "->"+nums[i]);
                }else{
                   result.add(nums[i]+""); 
                }
            }
        }
        return result;
        
    }
}