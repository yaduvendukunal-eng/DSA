class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder str = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {

            if(s.charAt(i) == '(') {
                if(!st.isEmpty()) {
                    str.append('(');
                }
                st.push('(');
            }
            else {
                st.pop();

                if(!st.isEmpty()) {
                    str.append(')');
                }
            }
        }

        return str.toString();
    }
}