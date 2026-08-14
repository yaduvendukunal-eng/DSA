class Solution {
    public boolean isPalindrome(String s) {
        boolean result=true;
        s=s.toLowerCase();
        s=s.replaceAll("[^a-z0-9]","");
        for(int i =0 ;i<s.length()/2;i++){
                if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                    result=false;
                    break;
                }
        }
        return result;
    }
}