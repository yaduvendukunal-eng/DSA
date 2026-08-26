class Solution {
    public String reverseVowels(String s) {
        char [] str = new char [s.length()];
        int left =0;
        int right =s.length()-1;
        String vowels = "aeiouAEIOU";
        str = s.toCharArray();

            while(left<right){
                if(vowels.indexOf(str[left])!=-1){
                    if(vowels.indexOf(str[right])!=-1){
                        char temp = str[left];
                        str[left]= str[right];
                        str[right]=temp;

                        left ++ ;
                        right--;
                    }
                    else{
                        right--;
                    }
                }
                else{

                left ++ ;
                }

            }
        return new String(str);
    }
}