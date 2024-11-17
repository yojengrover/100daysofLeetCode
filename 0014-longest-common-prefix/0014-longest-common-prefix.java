class Solution {
    public String longestCommonPrefix(String[] strs) {
       String sr ="";
        if(strs.length > 0){
        
            String s = strs[0];
            int result = 0;
             int j=0;
            //System.out.println("length "+strs.length);
             while(j < s.length()){
            for(int i = 0; i < strs.length - 1; i++){
               
              if(j < strs[i].length() && j < strs[i+1].length()) {
                if( strs[i].charAt(j) == strs[i+1].charAt(j) )  {
                    result++;
                   //System.out.println("catch "+strs[i].charAt(j) + "i "+ i);
                  }
               }
            }
                
            
            if( result == strs.length - 1 ){
                sr += s.charAt(j); 
            }else{
                j = s.length();
            }
                j++;
                result = 0;
                
             
        }
        
    } return sr;
}
}