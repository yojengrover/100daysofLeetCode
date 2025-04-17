class Solution {
    public int compress(char[] chars) {
        int write = 0; 
        int i = 0; 

        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;

            
            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }

            
            chars[write++] = currentChar;

            // If count > 1, write the digits of the count
            if (count > 1) {
                for (char digit : Integer.toString(count).toCharArray()) {
                    chars[write++] = digit;
                }
            }
        }

        return write;

    }
}