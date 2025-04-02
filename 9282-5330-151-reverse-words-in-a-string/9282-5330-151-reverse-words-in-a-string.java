class Solution {
    public String reverseWords(String s) {

        String[] words = s.trim().split("\\s+");
        int n = words.length - 1;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (n >= 0) {
            sb.append(words[n]);
            n--;
            if (n >= 0) {
                sb.append(" ");
            }

        }

        return sb.toString();

    }
}