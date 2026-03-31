class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26];
        for (char c : magazine.toCharArray()) {
            freq[c - 'a']++;
        }

        for (char ch : ransomNote.toCharArray()) {
            if (freq[ch - 'a'] <= 0) {
                return false;
            } else {
                freq[ch - 'a']--;
            }
        }
        return true;
    }
}