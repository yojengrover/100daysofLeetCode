class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int l = flowerbed.length;
        int i = 0;
        int count = 0;
        if(n == 0 ){
            return true;
        }
        if(n == 1 &&  l == 1 && flowerbed[i] == 0){
            return true;
        }
        while(i<l){
            if(i-1 >= 0 && i+1 < l){

               if(flowerbed[i] == 0 && flowerbed[i-1] == 0 && flowerbed[i+1] == 0){
                flowerbed[i] = 1;
                count++;
                //System.out.println("loop1  ");
                i++;
               }
            }
            if( i == 0 && i+1 < l ){
                 if(flowerbed[i] == 0 && flowerbed[i+1] == 0){
                    flowerbed[i] = 1;
                        count++;
                       // System.out.println("loop2  ");
                 }

            }
            if( i == l-1 && i - 1 >= 0 ){
                 if(flowerbed[i] == 0 && flowerbed[i-1] == 0){
                    flowerbed[i] = 1;
                        count++;
                      //  System.out.println("loop3  ");
                 }

            }

           // System.out.println("count = " + count);
            if(count == n){
                    return true;
                }

            i++;
        }

        return false;
        
    }
}