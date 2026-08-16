class Solution {
    public int minAddToMakeValid(String s) {
        int n = s.length();
        int ans = 0;
        int open = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                open++;
            }

            else {
                if (open > 0) {
                    open--;
                } else {
                    ans++;
                }
            }
        }
        return open + ans;
    }
}