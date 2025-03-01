class Solution {
    public List<String> letterCombinations(String digits) {
        Map<Character, String> mp = new HashMap<>();
        mp.put('2', "abc");
        mp.put('3', "def");
        mp.put('4', "ghi");
        mp.put('5', "jkl");
        mp.put('6', "mno");
        mp.put('7', "pqrs");
        mp.put('8', "tuv");
        mp.put('9', "wxyz");
        List<String> ans = new ArrayList<>();
        if (digits.isEmpty()) {
            return ans;
        }
        solve(ans, mp, digits, 0, "");
        return ans;
    }

    public void solve(List<String> ans, Map<Character, String> mp, String digits, int l, String cur) {
        if (l == digits.length()) {
            ans.add(cur);
            return;
        }

        String temp = mp.get(digits.charAt(l));
        for (int i = 0; i < temp.length(); i++) {
            cur += temp.charAt(i);
            solve(ans, mp, digits, l + 1, cur);
            cur = cur.substring(0, cur.length() - 1);
        }

    }
}