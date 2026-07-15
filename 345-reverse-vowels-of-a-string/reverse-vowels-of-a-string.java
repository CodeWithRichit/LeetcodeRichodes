class Solution {
    public String reverseVowels(String s) {
        int i=0,j=s.length()-1;
        String str="aeiouAEIOU";
        char[] chars = s.toCharArray();
        while(i<j){
            while(i < j && str.indexOf(chars[i]) == -1)
             i++;

            while(i < j && str.indexOf(chars[j]) == -1)
             j--;
            if(i<j){
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
            }
        }
        return new String(chars);
        }  
    }