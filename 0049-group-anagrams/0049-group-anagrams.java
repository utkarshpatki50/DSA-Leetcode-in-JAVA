class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        int n = strs.length;
        for (String word : strs) {
            char[] wordarr = word.toCharArray();
            Arrays.sort(wordarr);
            String key = new String(wordarr);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
