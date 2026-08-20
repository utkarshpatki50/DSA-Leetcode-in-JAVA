class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen=0;
        int n= s.length();
        HashMap<Character,Integer> map= new HashMap<>();

        int left=0;
        for(int right=0; right<n; right++){
            char ch= s.charAt(right);

            if(map.containsKey(ch)){
                left= Math.max(left, map.get(ch)+1);

            }

            map.put(ch, right);
            maxlen= Math.max(maxlen, right - left +1);
        }

        return maxlen;
    }
}