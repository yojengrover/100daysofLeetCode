class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> map = new HashSet<> ();
        List<List<Integer>> mapList = new ArrayList<> ();
        int left = 0;
        int right = nums.length -1;
        Arrays.sort(nums); 
        int j = 0;
        for(int n: nums){
          // System.out.println(nums);
           left = j;
           right = nums.length -1;
          for(int i = 0; i<nums.length; i++){
             
                if(left<right  ){

                    if(left == j ){
                        left++;
                        System.out.println(" left == j");
                    }
                    
                    if( right == j){ 
                        right--;
                        System.out.println(" right == j");
                    }
                  // System.out.println("   n = "+n+" left ="+ nums[left]+" right ="+nums[right]+"  j="+j);
                if((n+nums[left]+nums[right] ) == 0 && right != j && left !=j && left<right){
                  // System.out.println("Inside n = "+n+" left ="+ left+" right ="+right+"  j="+j);
                    List<Integer> arr = new ArrayList<>();
                    if (j <= left && j <= right) {
                        arr.add(n); // n corresponds to index j
                        if (left <= right) {
                            arr.add(nums[left]);
                            arr.add(nums[right]);
                        } else {
                            arr.add(nums[right]);
                            arr.add(nums[left]);
                        }
                        } else if (left <= j && left <= right) {
                        arr.add(nums[left]);
                        if (j <= right) {
                            arr.add(n); // n corresponds to index j
                            arr.add(nums[right]);
                        } else {
                            arr.add(nums[right]);
                            arr.add(n); // n corresponds to index j
                        }
                        } else {
                        arr.add(nums[right]);
                        if (j <= left) {
                            arr.add(n); // n corresponds to index j
                            arr.add(nums[left]);
                        } else {
                            arr.add(nums[left]);
                            arr.add(n); // n corresponds to index j
                        }
                    }
                    left++;
                    right--;
                    map.add(arr); 
                    //break;
                }else if((n+nums[left]+nums[right])>0){
                    right--;
                }
                else{
                    left++;
                }
                
            }}
            j++;

          }
        
        for(List<Integer> a: map){
            mapList.add(a);
        }
        return mapList;
    }
}