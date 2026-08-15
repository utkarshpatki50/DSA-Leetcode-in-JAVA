class Solution {
    public int longestPalindrome(String s) {
        int length = 0;
        Map<Character, Integer> freq = new HashMap<>();
        boolean odd = false;

        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        for (int i : freq.values()) {
            if (i % 2 == 0) {
                length += i;
            } else {
                odd = true;
                length += i - 1;
            }
        }

        if (odd) {
            length += 1;
        }

        return length;
    }
}