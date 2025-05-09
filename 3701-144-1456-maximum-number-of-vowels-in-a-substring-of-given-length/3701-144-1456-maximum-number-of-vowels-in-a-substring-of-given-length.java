class Solution {
    public int maxVowels(String s, int k) {
        int vowels = 0;
        int maxVowels = 0;

        for (int i = 0; i < s.length(); i++) {
            if (vowelCheck(s.charAt(i)))
                vowels++;

            if (i >= k) {
                if (vowelCheck(s.charAt(i - k)))
                    vowels--;
            }

            maxVowels = Math.max(maxVowels, vowels);
        }

        return maxVowels;

    }

    public static boolean vowelCheck(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}