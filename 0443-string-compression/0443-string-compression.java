class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int i = 0;
        int index = 0;

        while (i < n) {
            char currentChar = chars[i];
            int count = 0;

            while (i < n && chars[i] == currentChar) {
                count++;
                i++;
            }

            chars[index++] = currentChar;

            if (count > 1) {
                String countStr = String.valueOf(count);

                for (char ch : countStr.toCharArray()) {
                    chars[index++] = ch;
                }
            }
        }

        return index;
    }
}