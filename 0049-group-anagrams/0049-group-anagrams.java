class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> mp = new HashMap<>();
        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);

            String key = new String(chars);

            if (!mp.containsKey(key)) {
                mp.put(key, new ArrayList<>());
            }

            mp.get(key).add(word);
        }
        return new ArrayList<>(mp.values());
    }
}