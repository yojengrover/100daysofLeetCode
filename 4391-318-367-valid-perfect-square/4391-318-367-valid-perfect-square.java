class Solution {
    public boolean isPerfectSquare(int num) {
    
        int low = 0; 
        int high = num/2 + 1;
        
        
        while(low<= high){
            int mid = low + (high - low) / 2;
            long value = (long)mid*mid;
            //System.out.println("value-"+value);
            if(num < value){
                high = mid -1;
            }else if(num > value){
                low = mid +1;
            }else{
                return true;
                
            }
        }

        return false;
    }
}