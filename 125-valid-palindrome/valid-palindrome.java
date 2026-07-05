class Solution {
    public boolean isPalindrome(String s) {
        String st=s.toLowerCase();
        int i=0,j=s.length()-1;
        while(i<j){
           char ci=st.charAt(i);
           char cj=st.charAt(j);
           if(Character.isLetterOrDigit(ci) && Character.isLetterOrDigit(cj)){
            if(cj!=ci){
               return false;
            }
            else{
                i++;
                j--;
            }
           }
           else if(!Character.isLetterOrDigit(ci)){
            i++;
           }
           else if(!Character.isLetterOrDigit(cj)){
            j--;
           }
        }
        return true;
    }
}