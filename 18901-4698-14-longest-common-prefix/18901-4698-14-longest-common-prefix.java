class Solution {
    public String longestCommonPrefix(String[] strs) {
       
        if(strs.length == 0 || strs == null ){
            return "";
        }
           int minLength = Integer.MAX_VALUE;
           int j=0;
           while(j < strs.length ){
            minLength = Math.min(strs[j].length(), minLength);
            j++;
           }
            
            
        int i = 0;
        while (i < minLength) {
            for (String s : strs) {
                if (s.charAt(i) != strs[0].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
            i++;
        }
             
        
        
     return strs[0].substring(0,i);
}
}