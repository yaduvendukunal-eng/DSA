class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
            
            st.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(st.isEmpty()){
                st.push(s.charAt(i));
            }
            else if(st.peek()==s.charAt(i)){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        String str="";
        while(!st.isEmpty()){
            str = str + st.pop();
        }
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev += str.charAt(i);
        }
        return rev;
    }
}