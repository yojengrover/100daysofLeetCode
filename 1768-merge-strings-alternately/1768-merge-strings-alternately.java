class Solution {
    public String mergeAlternately(String word1, String word2) {
        int wordA = word1.length();
        int wordB = word2.length();
        int j = 0;
        int k = 0;
        int totalLength = wordA + wordB;
        String result ="";
        
        for(int i = 0; i < totalLength; i++){
            
            if(wordA > 0 ){
                result = result + word1.charAt(j);
                j++;
                wordA--;
            }
            
            if (wordB > 0){
                result = result + word2.charAt(k);
                wordB--;
                k++;
            }
           
        }
        
        return result;
        
    }
}