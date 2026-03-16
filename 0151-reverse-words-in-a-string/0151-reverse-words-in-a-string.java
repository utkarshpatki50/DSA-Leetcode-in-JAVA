class Solution {
    public String reverseWords(String s) {

        int n = s.length();
        char[] arr = s.toCharArray();
        // int start =0, end = arr.length-1;

        reverse(arr, 0, arr.length - 1);

        int start = 0;
        for (int end = 0; end <= arr.length; end++) {
            if (end == arr.length || arr[end] == ' ') {
                reverse(arr, start, end - 1);
                start = end + 1;
            }
        }

        return cleanSpaces(arr);
    }

    private String cleanSpaces(char[] arr) {

        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < arr.length) {

            if (arr[i] != ' ') {
                result.append(arr[i]);
            } else if (result.length() > 0 && result.charAt(result.length() - 1) != ' ') {
                result.append(' ');
            }

            i++;
        }

        return result.toString().trim();
    }

    private void reverse(char[] arr, int l, int r) {
        while (l < r) {
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            l++;
            r--;
        }
    }

    //Stack Approach  TC: O(n), SC: O(n)
    // int n = s.length();
    // StringBuilder ans = new StringBuilder();
    // StringBuilder word = new StringBuilder();
    // Stack<String> st = new Stack<>();

    // for (int i = 0; i < n; i++) {
    //     char ch = s.charAt(i);
    //     if (ch != ' ') {
    //         word.append(ch);
    //     } else {
    //         if (word.length() > 0) {
    //             st.push(word.toString());
    //             word.setLength(0);
    //         }
    //     }
    // }

    // if (word.length() > 0) {
    //     st.push(word.toString());
    // }

    // while(!st.empty()){
    //     ans.append(st.peek());
    //     st.pop();

    //     if(!st.isEmpty()){
    //         ans.append(' ');
    //     }
    // }
    // return ans.toString();
}