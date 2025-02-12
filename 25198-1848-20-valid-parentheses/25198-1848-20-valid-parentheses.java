class Solution {
    public boolean isValid(String s) {
        
        int cp = 0;
        char[] c = s.toCharArray();
        int n = c.length;
        char[] p = new char[n];
         for (int i = 0; i < n; i++) {
        if (cp > 0 && 
            ((c[i] == ')' && p[cp - 1] == '(') || 
             (c[i] == ']' && p[cp - 1] == '[') || 
             (c[i] == '}' && p[cp - 1] == '{'))) {
            cp--;  // Pop from stack
        } else {
            p[cp] = c[i];  // Push onto stack
            cp++;
        }
    }
    return cp == 0;
    } 
        
    
}