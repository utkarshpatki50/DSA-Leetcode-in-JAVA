class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int n = p.length();

        char[] pArr = p.toCharArray();
        Arrays.sort(pArr);
        String sortedP = new String(pArr);

        for (int i = 0; i <= s.length() - n; i++) {
            String subStr = s.substring(i, i + n);
            char[] subarr = subStr.toCharArray();
            Arrays.sort(subarr);

            if (sortedP.equals(new String(subarr))) {
                ans.add(i);
            }

        }
        return ans;
    }
}