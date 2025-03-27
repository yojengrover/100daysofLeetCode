class Solution {
    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length() - 1;

        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u','A', 'E', 'I', 'O', 'U');
        StringBuilder sb = new StringBuilder(s);

        while (i < j) {
            if (!vowels.contains(s.charAt(i))) {
                i++;
            }
            if (!vowels.contains(s.charAt(j))) {
                j--;
            }
            if (vowels.contains(s.charAt(i)) && vowels.contains(s.charAt(j))) {
                char temp = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, temp);
                i++;
                j--;
            }

        }

        return sb.toString();
    }
}