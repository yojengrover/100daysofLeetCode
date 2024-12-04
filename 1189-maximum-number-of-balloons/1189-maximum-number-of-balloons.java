class Solution {
    public int maxNumberOfBalloons(String text) {
     
     HashMap <Character, Integer> map = new HashMap<>();
        int count = 0;
        int ans =0;
        boolean isrunning = true;
      for(char i: text.toCharArray()){
          if(map.containsKey(i)){
              map.put(i,map.get(i) + 1);
          }else{
              map.put(i,1);
          }
      }
        
      String bo = "balloon";
      while(isrunning){  
      for(char i: bo.toCharArray()){
          if(map.containsKey(i)){
              map.put(i, map.get(i) - 1);
                  count++;
               if(map.get(i) == 0){
                   map.remove(i);
               }
              if(count == 7){
                  ans++;
              count = 0;
          }
                  
          }
          else{
              isrunning = false;
              return ans;
              
          }
          
      }
      }
        return ans;
    }
    
}