class Solution {
    public void help(char[] s,int st,int e){
        if(st>=e){
            return;
        }
        char temp=s[st];
        s[st]=s[e];
        s[e]=temp;
        st++;
        e--;
        help(s,st,e);
    }
    public void reverseString(char[] s) {
        help(s,0,s.length-1);
    }
}