class Solution {
    public int trap(int[] arr) {
        int sum = 0, result = 0, pot = 0;
        int n = arr.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        // rightMax[n-1] = 0;
        // leftMax[0] = 0;
        int currentMax = 0;
        for(int i = 0; i<n; i++){  
          leftMax[i] = currentMax;
          if(arr[i] > currentMax){
            currentMax = arr[i];
          }
        //   System.out.print(i +"i ");
        //   System.out.print(" "+leftMax[i]+" ");
        }
        currentMax = 0;
        
        int j = 0;
        for(int i = n-1; i>=0; i--){  
          rightMax[i] = currentMax;
          if(arr[i] > currentMax){
            currentMax = arr[i];
          }
          //System.out.print(i+"i "+rightMax[i]+" ");
          
        }
        for(int i = 0; i<n; i++){
           
            pot = Math.min(leftMax[i],rightMax[i]);
            
            if(pot>0){
                sum = pot - arr[i];
            }
           
           if(sum>0){
            result += sum;
            }
            sum=0;
        }  
        
        return result;
    }
    }
