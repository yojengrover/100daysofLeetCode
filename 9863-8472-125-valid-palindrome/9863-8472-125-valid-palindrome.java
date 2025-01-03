class Solution {
    public boolean isPalindrome(String s) {
        String c = s.replaceAll("[\\p{Punct}\\s]", "");
        c = c.toLowerCase(); 
        int mid = c.length()/2;
        int last = c.length() -1;
        System.out.println(c);
        for(int i = 0; i<mid; i++){
            if(c.charAt(i) != c.charAt(last)){
                System.out.println(c.charAt(i));
                return false;
            }
            last--;
        }
        return true;
    }
}