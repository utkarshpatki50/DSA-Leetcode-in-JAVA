class Solution {
    public boolean canConstruct(String r, String m) {
        HashMap<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < m.length(); i++) {
            char ch = m.charAt(i);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i< r.length(); i++) {
            char ch = r.charAt(i);
            if (mp.getOrDefault(ch, 0) > 0) {
                mp.put(ch, mp.get(ch) - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}
