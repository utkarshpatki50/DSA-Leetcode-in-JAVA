class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int maxVowels = 0, currentVowels = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {
            char ch = s.charAt(right);
            if (isVowel(ch)) {
                currentVowels++;
            }

            if (right - left + 1 > k) {
                if (isVowel(s.charAt(left))) {
                    currentVowels--;
                }
                left++;
            }

            if (right - left + 1 == k) {
                maxVowels = Math.max(maxVowels, currentVowels);
            }
        }
        return maxVowels;
    }

    public boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}