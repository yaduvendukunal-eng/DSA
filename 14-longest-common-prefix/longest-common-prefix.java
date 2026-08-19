class Solution {
    public String longestCommonPrefix(String[] strs) {
       int m =0;
       int n=0;
        String prefix=strs[0];
       for(int i=0;i<strs.length-1;i++){
            m=0;
            if(strs[i].length()>strs[i+1].length()){
                n = strs[i+1].length();
            }
            else{
                 n=strs[i].length();
            }
        for(int j=0;j<n;j++){
            if(strs[i].charAt(j)!=strs[i+1].charAt(j)){
                break;
            }
            m+=1;
        }
        if(prefix.length()>m){
            prefix=strs[i].substring(0,m);
        }
       }
       return prefix;
    }
}