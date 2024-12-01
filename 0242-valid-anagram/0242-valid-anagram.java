class Solution {
    public boolean isAnagram(String s, String t) {
        
        HashMap <Character, Integer> map = new HashMap<>();
        int n = s.length();
        for(char i: s.toCharArray()){
            if(map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            }
            else
            map.put(i, 1);
            
        }
        
        
        for(char i: t.toCharArray()){
            if(map.containsKey(i)){
                map.put(i, map.get(i) - 1);
               if(map.get(i) == 0){
                map.remove(i);
               }
            }
            else{
                return false;
            }
        }
        
        if(map.size() == 0){
            return true;
        }
        return false;
        
    }
}