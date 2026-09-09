class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        int k = p.length();
        char[] str1 = p.toCharArray();
      List<Integer> list = new ArrayList<>();
        for(int i=0;i<s.length()-k+1;i++){
        boolean t = true;
            String s1 =s.substring(i,i+k);
            char[] str = s1.toCharArray();
            Arrays.sort(str);
            Arrays.sort(str1);
            for(int j=0;j<str1.length;j++){
                if(str1[j]!=str[j]){
                    t=false;
                }
            }
            if(t){
                list.add(i);
            }
        }
        return list;
    }
}