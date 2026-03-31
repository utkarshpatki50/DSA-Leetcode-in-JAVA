class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int windowSize = p.length();
        List<Integer> ans = new ArrayList<>();

        if (s.length() < windowSize)
            return ans;
        int[] pFreq = new int[26];
        int[] windowFreq = new int[26];

        for (char ch : p.toCharArray()) {
            pFreq[ch - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            windowFreq[s.charAt(i) - 'a']++;

            if (i >= windowSize) {
                windowFreq[s.charAt(i - windowSize) - 'a']--;
            }

            if (Arrays.equals(pFreq, windowFreq)) {
                ans.add(i - windowSize + 1);
            }
        }
        return ans;
    }
}