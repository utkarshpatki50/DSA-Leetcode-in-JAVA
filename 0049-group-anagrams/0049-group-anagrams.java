class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> mp = new HashMap<>();
        for (String word : strs) {
            int[] freq = new int[26];

            for (char c : word.toCharArray()) {
                freq[c - 'a']++;
            }

            StringBuilder keyBuilder = new StringBuilder();
            for (int count : freq) {
                keyBuilder.append(count).append("#");
            }

            String key = keyBuilder.toString();
            if (!mp.containsKey(key)) {
                mp.put(key, new ArrayList<>());
            }

            mp.get(key).add(word);

        }
        return new ArrayList<>(mp.values());
    }
}

//Approach 2 Optimized
// for (String word : strs) {
// char[] chars = word.toCharArray();
// Arrays.sort(chars);

// String key = new String(chars);