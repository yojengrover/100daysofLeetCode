class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
    int length1 = word1.length(), length2 = word2.length();
    int i = 0, j = 0;
    
    // Merge characters alternately
    while (i < length1 || j < length2) {
        if (i < length1) {
            result.append(word1.charAt(i++));
        }
        if (j < length2) {
            result.append(word2.charAt(j++));
        }
    }
    
    return result.toString();
        
    }
}