class Solution {
    public boolean checkInclusion(String s1, String s2) {
            int k = s1.length();

         char[] str = s1.toCharArray();
         Arrays.sort(str);

         for (int i = 0; i <= s2.length() - k; i++) {

            boolean t = true;

            char[] str2 = s2.substring(i, i + k).toCharArray();
            Arrays.sort(str2);

            for (int j = 0; j < k; j++) {
                if (str[j] != str2[j]) {
                    t = false;
                    break;
                }
            }

            if (t) {
                return true;
            }
        }

        return false;
    }
}