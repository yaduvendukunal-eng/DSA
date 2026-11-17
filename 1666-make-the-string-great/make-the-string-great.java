class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            if(st.isEmpty()) {
                st.push(s.charAt(i));
            }
            else if(
                Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(st.peek())
                && s.charAt(i) != st.peek()
            ) {
                st.pop();
            }
            else {
                st.push(s.charAt(i));
            }
        }

        StringBuilder str = new StringBuilder();

        while(!st.isEmpty()) {
            str.append(st.pop());
        }

        return str.reverse().toString();
    }
}
/*1. Using ASCII values (not recommended for beginners)
(char)(s.charAt(i) - 32)
Converts lowercase English letters to uppercase. */