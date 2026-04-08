class Solution {

    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLen = 0;
        int left = 0;
        HashMap<Character, Integer> mp = new HashMap<>();

        for (int right = 0; right < n; right++) {
            char ch = s.charAt(right);
            if (mp.containsKey(ch)) {
                left = Math.max(left, mp.get(ch) + 1);
            }

            mp.put(ch, right);
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
