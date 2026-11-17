class Solution {
    public boolean backspaceCompare(String s, String t) {
      Stack<Character> st = new Stack<>();
      Stack<Character> st1 = new Stack<>();
      for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='#'){
                st.push(s.charAt(i));
            }
            else if(s.charAt(i)=='#' && st.isEmpty()){
                continue;
            }
            else{
                st.pop();            
            }
      }
      for(int i=0;i<t.length();i++){
         if(t.charAt(i)!='#'){
                st1.push(t.charAt(i));
            }
        else if(t.charAt(i)=='#' && st1.isEmpty()){
                continue;
            }
        else{
                st1.pop();            
            }
      }
     while(!st.isEmpty() && !st1.isEmpty()){
        if(st.pop()!=st1.pop()){
        return false;
        }
    }

    return st.isEmpty() && st1.isEmpty();

    }
}