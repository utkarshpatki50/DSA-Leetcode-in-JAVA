class Solution {
    public int longestPalindrome(String s) {
        int count = 0;
        HashMap<Character , Integer> map = new HashMap<>();
        for(char  c: s.toCharArray()){
             map.put(c , map.getOrDefault(c,0)+1);
        }
        boolean odd = false;
        for(int i :  map.values()){
            if(i %2 ==0){
                count +=i;
            }else{
                count += i -1;
                odd = true;
            }
        }
        if(odd){
            count +=1;
        }
       
       return count;
        
    }
}