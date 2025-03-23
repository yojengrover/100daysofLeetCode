class Solution {
    public int maxSum(int[] nums) {
        Set<Integer> map = new HashSet<>();
        int sum = Integer.MIN_VALUE;
        boolean hasPos = false;
        int pSum = 0;
        for(int i: nums){
            if(map.contains(i) || i < 1){
                continue;
            }else{
                hasPos = true;
                map.add(i);
                pSum += i;
            }
        }

        if(!hasPos){
            for(int i: nums){
                sum = Math.max(sum, i);
            }

            return sum;

        }

        return pSum;
        
    }
}