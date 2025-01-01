class Solution {
    public int majorityElement(int[] nums) {
    
       HashMap<Integer, Integer> map = new HashMap<>();
       if(nums.length > 0){
        map.put(nums[0],1);
       }
       for(int i = 1; i<nums.length; i++){
          if(map.containsKey(nums[i])){
            map.put(nums[i],map.get(nums[i])+1);
           // System.out.println("add ");
          }else if(map.get(map.keySet().iterator().next())== 0){
            map.clear();
            map.put(nums[i],1);
          }
          else {
            map.put(map.keySet().iterator().next(), map.get(map.keySet().iterator().next())-1);
          } 

        //  System.out.println(map.keySet().iterator().next()+","+map.get(map.keySet().iterator().next()));
       }

       return map.keySet().iterator().next();
    }
}