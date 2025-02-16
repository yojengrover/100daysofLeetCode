class Solution {
    public int search(int[] nums, int t) {
        int n = nums.length;
        if(n == 0){
            return -1;
        }
        int low = 0;
        int high = n-1;
         
      while(low <= high){ 
        int mid = low + (high - low) /2;
        //System.out.println(nums[mid]+"low - "+ low+" high - "+high);
        if(nums[mid] > t ){ 
            high = mid - 1; 
        } else if(nums[mid] < t)
        { low = mid +1;}
        else
        {return mid; }
        
        }
        return -1;
       }
       
    }
