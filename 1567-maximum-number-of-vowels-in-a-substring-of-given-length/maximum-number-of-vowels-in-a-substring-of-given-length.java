class Solution {
    public  boolean isVowel(char ch){
      return "aeiouAEIOU".indexOf(ch)!=-1;}
    public int maxVowels(String s, int k) {
        int count=0;
        int left=0;
        int max=0;
       
      
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))) count++;
        }
        max=count;
        for(int i=k;i<s.length();i++){
            if(isVowel(s.charAt(i))) count++;
            if(isVowel(s.charAt(left++))) count--;
            max=Math.max(count,max);
        }
         return max;
    }
}