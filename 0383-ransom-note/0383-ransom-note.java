class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;
        for(char i: magazine.toCharArray()){
            if(map.containsKey(i)){
                map.put(i,map.get(i) + 1);
            }
            else{
                map.put(i, 1);
            }
        }
        
        System.out.println(map);
        for(char i: ransomNote.toCharArray()){
            if(map.containsKey(i) ){
                map.put(i,map.get(i) - 1);
                if(map.get(i) == 0){
                    map.remove(i);
                }
            }
            else{
                return false;
            }
        }
        
        System.out.println(map);
        
       
        
        return true;
    }
}