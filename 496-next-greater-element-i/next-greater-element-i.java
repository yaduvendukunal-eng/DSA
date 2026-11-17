class Solution {
    public int[] nextGreaterElement(int[] a, int[] b) {
        int[] map = new int[10001];
        Arrays.fill(map, -1);

        Stack<Integer> st = new Stack<>();

        for(int x : b) {
            while(!st.isEmpty() && x > st.peek())
                map[st.pop()] = x;
            st.push(x);
        }

        int[] ans = new int[a.length];
        for(int i = 0; i < a.length; i++)
            ans[i] = map[a[i]];

        return ans;
    }
}