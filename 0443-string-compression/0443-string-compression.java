class Solution {

    public int compress(char[] chars) {
        int n = chars.length;
        int i = 0, index = 0;

        while (i < n) {
            char currentChar = chars[i];
            int count = 0;

            while (i < n && chars[i] == currentChar) {
                i++;
                count++;
            }

            chars[index++] = currentChar;
            if (count > 1) {
                String countStr = String.valueOf(count);
                for (char c : countStr.toCharArray()) {
                    chars[index++] = c;
                }
            }
        }
        return index;
    }
}
