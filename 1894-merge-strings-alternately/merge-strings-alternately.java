class Solution {
    public String mergeAlternately(String word1, String word2) {
      int n = word1.length();
int m = word2.length();

String s = "";

int i = 0;

while (i < n || i < m) {

    if (i < n) {
        s = s + word1.charAt(i);
    }

    if (i < m) {
        s = s + word2.charAt(i);
    }

    i++;
}

return s;
    }
}