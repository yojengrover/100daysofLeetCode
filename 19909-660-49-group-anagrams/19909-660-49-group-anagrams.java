class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String, List> map = new HashMap<>();
        for(String str: strs){
        int[] frequency = new int[26];  // For 26 lowercase English letters
        for (char c : str.toCharArray()) {
            frequency[c - 'a']++;  // Increase the count for the character
        }

        // Convert the frequency array into a string key
        StringBuilder key = new StringBuilder();
        for (int count : frequency) {
            key.append(count);
            key.append('#');  // Separator to differentiate counts
        }

        String k = key.toString();
        if(!map.containsKey(k)){
            map.put(k,new ArrayList<String>());
        }
        map.get(k).add(str);
        }
        return new ArrayList(map.values());
        }


}