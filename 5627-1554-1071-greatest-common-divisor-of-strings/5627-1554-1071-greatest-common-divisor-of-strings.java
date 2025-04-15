class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String res = "";
        String smS = "";
        String other = "";

        int one = str1.length();
        int two = str2.length();
        int f = 0;
        if (one <= two) {
            f = one;
            smS = str1;
            other = str2;
        } else {
            f = two;
            smS = str2;
            other = str1;

        }
        for (int i = 0; i < f; i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                String s = smS.substring(0, i + 1); // candidate substring
                // Check if s can build smS by repetition
                if (smS.length() % s.length() == 0 && s.repeat(smS.length() / s.length()).equals(smS)) {
                    //System.out.println("loop2: " + s + " | other: " + other + " | s length: " + s.length());
                    // Check if s can build other string by repetition
                    if (other.length() % s.length() == 0 && s.repeat(other.length() / s.length()).equals(other)) {
                        //System.out.println("loop3: " + s);
                        res = s; // store result
                    }
                }
            }
        }

        return res;

    }

}