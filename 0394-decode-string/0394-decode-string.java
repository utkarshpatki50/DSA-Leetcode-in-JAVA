class Solution {
    public String decodeString(String s) {
        int n= s.length();
        Stack<Integer> countStack= new Stack<>();
        Stack<String> strStack= new Stack<>();

        String currString="";
        int num=0;

        for(char ch: s.toCharArray()){
            if(Character.isDigit(ch)){
                num= num*10 + (ch-'0');
            }

            else if(ch== '['){
                countStack.push(num);
                strStack.push(currString);

                num=0;
                currString="";

            }

            else if(ch== ']'){
                int repeat= countStack.pop();
                String prevString= strStack.pop();

                StringBuilder temp= new StringBuilder(prevString);
                for(int i=0; i<repeat; i++){
                    temp.append(currString);
                }

                currString= temp.toString();
            }

            else{
                currString += ch;
            }
        }
        return currString;
    }
}