class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r =0;
        int n = s.length();
        HashSet<Character> set = new HashSet<>();
        int cur  = 0;
        int max = 0;
        while(r<n){

            if (set.add(s.charAt(r))) { // Add unique character
                r++; 
                max = Math.max(max, r - l); // Update max here
            } else {
                set.remove(s.charAt(l)); // Remove leftmost character
                l++; 
            }

            //max = Math.max(max,cur);
        }

        return max; 
    }
}